import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Employee[capacity];
    }

    public void add(Employee employee) {
        if(size() == queue.length - 1) {
            int size = size();
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;

            front = 0;
            back = size;
        }

        // jane
        // jone
        //          -back
        // mary     -front
        // bill

        // mary - front
        // bill
        // jane
        // jone
        //      - back

        //jane - front
        // jone
        // mary
        // bill
        //         - back

        queue[back] = employee;
        if(back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
//        if(back == queue.length - 1) {
//            back = 0;
//        } else {
//            back++;
//        }
    }

    public Employee remove() {

        if(size() == 0)
        {
            throw new NoSuchElementException();
        }

        Employee employee = queue[front];
        queue[front] = null;
        front++;

        if(size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        System.out.println("Remove queue: " + employee);
        return employee;
    }

    public Employee peek() {
        if(size() == 0) {
            throw new NoSuchElementException();
        }
        System.out.println("Peek Queue:");
        return queue[front];
    }

    public int size() {
        if(front <= back) {
            return back - front;
        } else {
            return queue.length - front + back;
        }

    }

    public void printQueue() {
        System.out.println("Print Queue: ");
        if(front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for(int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
        }
    }
}
