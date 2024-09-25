package OddOneOut.Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxStackTest {

    @Test
    public void testMaxAfterPush() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        assertEquals(6, stack.max());
    }

    @Test
    public void testMaxAfterPop() {
        MaxStack stack = new MaxStack();
        stack.push(3);
        stack.push(2);
        stack.push(5);
        stack.push(6);
        stack.pop();
        assertEquals(5, stack.max());
    }

    @Test
    public void testMaxSingleElement() {
        MaxStack stack = new MaxStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        assertEquals(3, stack.max());
    }
}
