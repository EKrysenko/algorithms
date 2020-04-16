package topics.design;

public class MinStack {
    private StackElement top;

    public void push(int x) {
        StackElement element = new StackElement();
        element.value = x;
        element.previous = this.top;
        element.min = this.top == null ? x : Math.min(x, this.top.min);
        this.top = element;
    }

    public void pop(){
        this.top = this.top.previous;
    }

    public int top(){
        return this.top.value;
    }

    public int getMin(){
        return this.top.min;
    }

    private class StackElement {
        int value;
        int min;
        StackElement previous;
    }
}
