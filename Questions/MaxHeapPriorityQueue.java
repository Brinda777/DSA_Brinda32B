public class MaxHeapPriorityQueue {

    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeapPriorityQueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private void heapifyDown(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left] > heap[largest]) {
            largest = left;
        }

        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != index) {
            swap(index, largest);
            heapifyDown(largest);
        }
    }

    private void heapifyUp(int index) {
        int parent = parent(index);

        if (parent >= 0 && heap[parent] < heap[index]) {
            swap(parent, index);
            heapifyUp(parent);
        }
    }

    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("Priority queue is empty.");
        }
        return heap[0];
    }

    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Priority queue is empty.");
        }

        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return max;
    }

    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Priority queue is full.");
        }

        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        MaxHeapPriorityQueue maxHeap = new MaxHeapPriorityQueue(10);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(8);
        maxHeap.insert(2);
        maxHeap.insert(6);

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.extractMax() + " ");
        }
    }
}
