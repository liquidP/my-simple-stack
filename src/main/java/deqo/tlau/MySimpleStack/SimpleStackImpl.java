package deqo.tlau.MySimpleStack;

import deqo.tlau.MySimpleStack.SimpleStack;

import java.util.EmptyStackException;
import java.util.Objects;
import java.util.Stack;

/**
 * Created by 21205213 on 04/11/2016.
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    public int getSize() {
        return wrappedStack.size();
    }

    public void push (Item item) {
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
