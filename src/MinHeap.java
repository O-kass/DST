

public class MinHeap {
    private int[] heap;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    // Constructor to initialize the heap with the given capacity
    public MinHeap() {
        heap = new int[INITIAL_CAPACITY];
        size = 0;
    }

    // Method to insert a value into the heap
    public void insert(int value) {
        // Ensure space for the new value
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, size * 2);
        }

        // Insert the new value at the end and perform "up-heap" operation
        heap[size] = value;
        size++;
        heapifyUp(size - 1);
    }

    // Method to extract the minimum element (the root)
    public int extractMin() {
        if(size == 0){
            throw new NullPointerException("Cannot extract a value when no values in heap");
        }
        else{
            int min = heap[0];
            swap(0, size()-1);
            size--;
            heapifyDown(0);
            return min;
        }

    }

    // Method to return the minimum element without removing it
    public int getMin() {
        if(size == 0){
            throw new NullPointerException("Cannot extract a value when no values in heap");
        }
        else{
            return heap[0];
        }

    }

    // Method to check if the heap is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the number of elements in the heap
    public int size() {
        return size;
    }

    // Helper method for the "up-heap" operation (used during insertion)
    private void heapifyUp(int index) {
        if(index <= 0){
            return;
        }
        else{
            int parent = heap[(index-1)/2];
            if(heap[index] < parent){
                swap(index, (index-1)/2);
                heapifyUp((index-1)/2);
            }
        }
    }

    // Helper method for the "down-heap" operation (used after extraction)
    private void heapifyDown(int index) {
        while((index*2) + 1 < size()){
            int leftIndex = (index*2) + 1;
            int smallestChild = leftIndex;

            if((index*2) + 2 < size()){
                int rightIndex = (index*2) + 2;
                if(heap[rightIndex] < heap[leftIndex]){
                    smallestChild = rightIndex;
                }
            }
            if(heap[smallestChild] >= heap[index]){
                break;
            }
            swap(smallestChild, index);
            index = smallestChild;

        }
    }

    // Helper method to swap two elements in the heap
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
