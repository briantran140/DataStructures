import java.util.EmptyStackException;
import java.util.ListIterator;

public class LinkedStack1 {

    private EmployeeSinglyLinkedList<Employee> stack;

    public LinkedStack1() {
        stack = new EmployeeSinglyLinkedList<>();
    }

    public void push(Employee employee) {
        stack.addToFront(employee);
    }

    public Employee pop() {
        return stack.removeFromFront();
    }

    public Employee peek() {
        return stack.peek();
    }

    public void printStack() {
        stack.printStack();
    }
}
