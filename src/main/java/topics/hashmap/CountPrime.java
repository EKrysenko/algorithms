package topics.hashmap;

public class CountPrime {

    public static int count(int n) {
        boolean[] tmp = new boolean[n];
        for (int i = 2; i*i < n; i++) {
            if (!tmp[i]) {
                for(int k = i*i; k < n; k += i) {
                    tmp[k] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < tmp.length; ++i) {
            if (!tmp[i]) ++count;
        }

        return count;
    }
}
