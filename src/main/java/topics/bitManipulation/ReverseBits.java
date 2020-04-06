package topics.bitManipulation;

public class ReverseBits {
    public static int reverse(int n) {
        int start = 0, end = 31;

        while (start < end) {
            if (((n >> start) & 1) != ((n >> end) & 1)) {
                n ^= (1 << start);
                n ^= (1 << end);
            }
            ++start;
            --end;
        }
        return n;
    }
}
