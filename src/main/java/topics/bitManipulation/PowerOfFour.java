package topics.bitManipulation;

public class PowerOfFour {
    public static boolean isPowerOfFour(int num) {
        if (num < 0) return false;
        int lsbPosition = 0;

        while (lsbPosition < 31) {
            if (((num >> lsbPosition) & 1) == 1) break;
            lsbPosition++;
        }

        return (num & (num - 1)) == 0 && lsbPosition % 2 == 0;
    }
}
