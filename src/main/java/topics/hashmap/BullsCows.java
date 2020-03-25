package topics.hashmap;

import java.util.ArrayList;
import java.util.List;

public class BullsCows {
    public static String listSolution(String secret, String guess) {
        int a = 0, b = 0;
        List<Character> secretList = new ArrayList<>();
        List<Character> guessList = new ArrayList<>();

        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) ++a;
            else {
                secretList.add(secret.charAt(i));
                guessList.add(guess.charAt(i));
            }
        }

        for (Character character : guessList) {
            if (secretList.contains(character)) {
                ++b;
                secretList.remove(character);
            }
        }

        return String.format("%dA%dB", a, b);
    }

    public static String arraySolution(String secret, String guess) {
        int a = 0, b = 0;
        int[] digits = new int[10];
        boolean[] isBull = new boolean[secret.length()];

        for (int i = 0; i < isBull.length; i++) {
            int digitPosition = secret.charAt(i) - '0';
            if (secret.charAt(i) == guess.charAt(i)) {
                isBull[i] = true;
                ++a;
                --digits[digitPosition];
            }
            ++digits[digitPosition];
        }

        for (int i = 0; i < isBull.length; i++) {
            int digitPosition = guess.charAt(i) - '0';
            if (!isBull[i] && digits[digitPosition] > 0) {
                ++b;
                --digits[digitPosition];
            }
        }

        return String.format("%dA%dB", a, b);
    }
}
