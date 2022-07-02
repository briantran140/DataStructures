public class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(isEmpty()) {
            tail = node;
        } else {
            head.setPrevious(node);
        }

        node.setNext(head);
        head = node;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(isEmpty()) {
            head = node;
        } else {
            tail.setNext(node);
        }
        node.setPrevious(tail);
        tail = node;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee oldEmployee) {
        if(head == null) {
            return false;
        }
        // Traverse List
        EmployeeNode current = head;


        while(current != null && !current.getEmployee().equals(oldEmployee)) {
            current = current.getNext();
        }

        System.out.println(current.getEmployee() == oldEmployee);
        // Add before node
        if (current == null) return false;
        EmployeeNode newNode = new EmployeeNode(newEmployee);


        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if(current == head) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;
        System.out.println("abc");
        return true;
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        removedNode.setNext(null);

        size--;
        return removedNode;
    }

    public EmployeeNode removeFromEnd() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if(head.getNext() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        removedNode.setPrevious(null);
        size --;
        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print(" HEAD => ");
        while(current != null) {
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}