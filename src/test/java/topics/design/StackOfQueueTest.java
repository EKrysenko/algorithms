package topics.design;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StackOfQueueTest {

    @Test
    void stackOfQueueSequenceTest() {
        StackOfQueue stack = new StackOfQueue();
        Assertions.assertTrue(stack.empty());
        stack.push(1);
        stack.push(2);
        Assertions.assertEquals(2, stack.top());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertFalse(stack.empty());
    }
}