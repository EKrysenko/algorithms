package topics.string;

import java.util.Deque;
import java.util.LinkedList;

public class ParenthesesValidator {

    public static boolean validate(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (isOpen(curr)) stack.push(curr);

            else if (!stack.isEmpty() && isPair(stack.pop(), curr)) {
            } else return false;
        }
        return stack.isEmpty();
    }

    private static boolean isOpen(char c) {
        return c == '{' || c == '(' || c == '[';
    }

    private static boolean isPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
