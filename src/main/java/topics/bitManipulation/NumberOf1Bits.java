package topics.bitManipulation;

public class NumberOf1Bits {
    public static int hammingWeight(int n) {
        int start = 0, end = 31;
        int weight = 0;
        while (start <= end) {
            if (start == end) weight += (n >> start) & 1;

            weight += (n >> start) & 1;
            weight += (n >> end) & 1;
            start++;
            end--;
        }
        return weight;
    }
}
