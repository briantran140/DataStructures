import java.util.EmptyStackException;
import java.util.ListIterator;

public class ArrayStack1 {

    private Employee[] stack;
    private int top;

    public ArrayStack1(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if(top == stack.length) {
            Employee[] newStack = new Employee[2 * stack.length];
            System.arraycopy(stack,0,newStack,0,stack.length);
            stack = newStack;
        }

        stack[top++] = employee;
    }

    public Employee pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        Employee removedEmployee = stack[--top];
        stack[top] = null;

        return removedEmployee;
    }

    public Employee peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int getSize() {
        return top;
    }

    public void printStack() {
        System.out.println("Print stack: ");
        for(int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }
}
