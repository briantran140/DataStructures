public class EmployeeSinglyLinkedList {

    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        node.setNext(head);
        head = node;

        size++;
    }

    public EmployeeNode removeFromFront() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;
        System.out.println("RemovedNode: " + removedNode);
        System.out.println("Head: " + head);
        head = head.getNext();
        System.out.println("Head after head.getNext(): " + head);
        System.out.println("Removed after head.getNext() " + removedNode);
        removedNode.setNext(null);
        size--;
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
