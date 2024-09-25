package OddOneOut.src;
import java.util.Stack;

public class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.push(x);
        if (maxStack.isEmpty() || x >= maxStack.peek()) {
            maxStack.push(x);
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = mainStack.pop();
        if (value == maxStack.peek()) {
            maxStack.pop();
        }
        return value;
    }

    public int max() {
        if (maxStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return maxStack.peek();
    }
}


