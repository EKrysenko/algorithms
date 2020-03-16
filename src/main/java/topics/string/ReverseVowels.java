package topics.string;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int front = 0, back = chars.length - 1;
        while (front < back) {
            if (!isVowel(chars[front])) {
                front++;
                continue;
            }
            if (!isVowel(chars[back])) {
                back--;
                continue;
            }
            char tmp = chars[front];
            chars[front] = chars[back];
            chars[back] = tmp;

            front++;
            back--;
        }
        return new String(chars);
    }

    private static boolean isVowel(char current) {
        return current == 'a'
                || current == 'A'
                || current == 'e'
                || current == 'E'
                || current == 'i'
                || current == 'I'
                || current == 'o'
                || current == 'O'
                || current == 'u'
                || current == 'U';
    }
}
