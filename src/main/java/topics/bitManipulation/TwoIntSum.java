package topics.bitManipulation;

public class TwoIntSum {
    public static int sum(int a, int b) {

        while (b != 0) {
            int carry = a & b; // тут определяются биты, которые выставятся в 0 и увеличат разряд
            a = a ^ b; // тут определяются биты, которые выставятся в 1 без увеличения разрядности
            b = carry << 1; // двигаем "увеличивалку разрядов" влево
        }

        return a;
    }
}
