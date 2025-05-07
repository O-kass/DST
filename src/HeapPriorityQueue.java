import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;


public class HeapPriorityQueue<K, V> extends AbstractPriorityQueue<K, V> {

    protected ArrayList<Entry<K, V>> heap = new ArrayList<>();

    public HeapPriorityQueue() {
    }

    public HeapPriorityQueue(Comparator<K> c) {
        super(c);
    }

    public HeapPriorityQueue(K[] keys, V[] values) {
        super();
        for (int j = 0; j < Math.min(keys.length, values.length); j++) {
            heap.add(new PQEntry<>(keys[j], values[j]));
        }
        heapify();
    }

    // protected utilities
    protected int parent(int j) {
        return (j - 1) / 2;
    }

    protected int left(int j) {
        return 2 * j + 1;
    }

    protected int right(int j) {
        return 2 * j + 2;
    }

    protected boolean hasLeft(int j) {
        return this.left(j) < heap.size();
    }

    protected boolean hasRight(int j) {
        return this.right(j) < heap.size();
    }

    /**
     * Exchanges the entries at indices i and j of the array list.
     *
     * @param i
     * @param j
     */
    protected void swap(int i, int j) {
        if (i > heap.size() || i < 0 || j > heap.size() || j < 0) {
            return;
        }

        Entry<K, V> elementI = heap.get(i);
        Entry<K, V> elementJ = heap.get(j);
        heap.set(i, elementJ);
        heap.set(j, elementI);

    }

    /**
     * Moves the entry at index j higher, if necessary, to restore the heap
     * property.
     *
     * @param j
     */
    protected void upHeap(int j) {
        if (j >= heap.size() || j <= 0) {
            return;
        } else {
            //MAX HEAP if want min heap it is < 0
            if (compare(heap.get(j), heap.get(parent(j))) > 0) {
                swap(j, parent(j));
                upHeap((j - 1) / 2); // can just say upHeap(parent(j))
            }

        }
    }

    /**
     * Moves the entry at index j lower, if necessary, to restore the heap
     * property.
     *
     * @param j
     */
    protected void downHeap(int j) {
        while (hasLeft(j)) {
            int leftIndex = left(j);
            int bigChildIndex = leftIndex;

            if (hasRight(j)) {
                int rightIndex = right(j);
                if (compare(heap.get(rightIndex), heap.get(leftIndex)) > 0) {
                    bigChildIndex = rightIndex;
                }
            }

            if (compare(heap.get(bigChildIndex), heap.get(j)) <= 0) {
                break;
            }

            swap(j, bigChildIndex);
            j = bigChildIndex;
        }
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public Entry<K, V> min() {
        if (heap.isEmpty()) {
            return null;
        }

        return heap.get(0);
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
    }

    @Override
    public Entry<K, V> removeMin() {
        if (heap.isEmpty()) {
            return null;
        }

        Entry<K, V> temp = heap.get(0);
        swap(0, heap.size() - 1);
        heap.remove(heap.size() - 1);
        downHeap(0);
        return temp;
    }

    public Entry<K, V> insert(K key, V value) {
        Entry<K, V> entry = new PQEntry<>(key, value);
        heap.add(entry);                      // add to the end
        upHeap(heap.size() - 1);              // restore heap property

        return entry;
    }

    /**
     * Performs a bottom-up construction of the heap in linear time.
     */
    protected void heapify() {
        int startIndex = parent(size() - 1);        // start at PARENT of last entry
        for (int j = startIndex; j >= 0; j--) {     // loop until processing the root
            downHeap(j);
        }
    }
}