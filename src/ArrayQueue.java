/**
 * Implementation of the queue ADT using a fixed-length array.
 */
public class ArrayQueue<E>{

    private static final int CAPACITY = 10;
    // instance variables
    private E[] data; // generic array used for storage
    private int f = 0; // index of the front element
    private int sz = 0; // current number of elements

    // constructors
    public ArrayQueue() {
        this(CAPACITY);
    } // constructs queue with default capacity

    public ArrayQueue(int capacity) { // constructs queue with given capacity
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
    }

    // methods

    /**
     * Returns the number of elements in the queue.
     */
    public int size() {
        return sz;
    }

    /**
     * Tests whether the queue is empty.
     */
    public boolean isEmpty() {
        return sz==0;
    }

    /**
     * Inserts an element at the rear of the queue.
     */
    public void enqueue(E e) throws IllegalStateException {
        if(sz == data.length){
            System.out.println("QUEUE FULL");
        }
        else{
            int available = (f + sz) % data.length;

        }
    }

    /**
     * Returns, but does not remove, the first element of the queue (null if empty).
     */
    public E first() {
        if(isEmpty()){
            return null;
        }
        else {
            return data[f];
        }
    }

    /**
     * Removes and returns the first element of the queue (null if empty).
     */
    public E dequeue() {
        if(data[f] == null){
            return null;
        }
        else{
            E element = data[f];
            data[f] = null;
            f = (f+1)  % data.length;
            sz--;
            return element;
        }
    }
}