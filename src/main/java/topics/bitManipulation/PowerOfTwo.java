package topics.bitManipulation;

public class PowerOfTwo {
    public static boolean isPowerOfTwoTrivial(int n) {
        int start = 0, sum = 0, end = 31;

        while (start <= end) {
            if (start == end) {
                sum += (n >> start) & 1;
                break;
            }
            sum += (n >> start) & 1;
            sum += (n >> end) & 1;
            if (sum > 1) break;
            ++start;
            --end;
        }
        return sum == 1;
    }

    public static boolean isPowerOfTwoTricky(int n) {
        return n > 0 && (n &(n - 1)) == 0;
    }
}
