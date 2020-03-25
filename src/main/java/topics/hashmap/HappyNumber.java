package topics.hashmap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    Set<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {
        int sum = 0;

        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n = n / 10;
        }
        if (set.contains(sum)) {
            return false;
        }
        set.add(sum);
        return sum == 1 || isHappy(sum);
    }
}
