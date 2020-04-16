package topics.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {

    @Test
    void push() {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(3);
        stack.push(2);
        Assertions.assertEquals(1, stack.getMin());
        stack.pop();
        Assertions.assertEquals(3, stack.top());
    }
}