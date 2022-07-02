import java.util.NoSuchElementException;

public class Heap {

    public int[] heap;
    public int size;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public void insert(int value) {
        if(isFull()) {
            throw new IndexOutOfBoundsException();
        }

        heap[size] = value;
        fixHeapAbove(size);
        size++;
    }


    public void sort() {
        int lastHeapIndex = size - 1;

        for(int i = 0; i < lastHeapIndex; i++) {
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex - i];
            heap[lastHeapIndex - i] = temp;

            fixHeapBelow(0, lastHeapIndex - i - 1);
        }
    }
    public int delete(int index) {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        int lastHeapIndex = size - 1;
        int parent = getParent(index);
        int deletedElement = heap[index];
        heap[index] = heap[lastHeapIndex];
        if(index == 0 || heap[index] < heap[parent]) {
                fixHeapBelow(index, size - 1);
        } else {
            fixHeapAbove(index);
        }

        size--;
        return deletedElement;
    }

    public int peek() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }

        return heap[0];
    }

    private void fixHeapBelow(int index, int lastHeapIndex) {
        int childToSwapIndex;

        // When we haven't reached the end
        while(index <= lastHeapIndex) {
            int leftChildIndex = getChild(index, true);
            int rightChildIndex = getChild(index, false);
            if(leftChildIndex <= lastHeapIndex) {
                // if we have a right child
                if(rightChildIndex <= lastHeapIndex) {
                    childToSwapIndex = heap[leftChildIndex] >= heap[rightChildIndex] ? leftChildIndex : rightChildIndex;
                }
                // if we don't have a right child
                else {
                    childToSwapIndex = leftChildIndex;
                }

                // swap the value with the largest child
                if(heap[index] < heap[childToSwapIndex]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwapIndex];
                    heap[childToSwapIndex] = temp;
                }
                else {
                    break;
                }

                // change index value to childToSwap value so the loop can continue loop.
                index = childToSwapIndex;
            }
            // if we don't have a child
            else {
                break;
            }
        }
    }

    private void fixHeapAbove(int index) {
        int originalElement = heap[index];
        while(index > 0 && heap[index] > heap[getParent(index)]) {
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }

        heap[index] = originalElement;
    }

    public int getParent(int index) {
        return (index - 1) / 2;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private int getChild(int index, boolean left) {
        return 2 * index + (left ? 1 : 2);
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(heap[i] + ", ");
        }
        System.out.println();
    }

}
