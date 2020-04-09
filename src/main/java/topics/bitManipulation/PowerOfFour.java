package topics.bitManipulation;

public class PowerOfFour {
    // У степеней четвёрки может быть только один установленный бит, и его позиция чётна.
    public static boolean isPowerOfFour(int num) {
        if (num < 0) return false;
        int lsbPosition = 0;

        while (lsbPosition < 31) {
            if (((num >> lsbPosition) & 1) == 1) break;
            // n >> m сдвигает все биты n на m вправо. Т.е. бит числа n на позиции m приедет в 0
            // num & 1 - проверка нулевого бита (проверка чётности)
            lsbPosition++;
        }

        return (num & (num - 1)) == 0 && lsbPosition % 2 == 0;
        /*
         * num & (num - 1),
         *
         * 10100100 & 10100011 = 1010000
         *
         * */
    }
}
