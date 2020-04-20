package topics.design;

import java.util.LinkedList;
import java.util.Queue;

public class StackOfQueue {

    private Queue<Integer> first = new LinkedList<>();
    private Queue<Integer> second = new LinkedList<>();


    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        while (!first.isEmpty()) second.add(first.remove());

        first.add(x);
        while (!second.isEmpty()) first.add(second.remove());
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return first.remove();
    }

    /**
     * Get the top element.
     */
    public int top() {
       int top = this.pop();
       this.push(top);
        return top;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return first.isEmpty();
    }

}
