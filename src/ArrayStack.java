/**
 * A collection of objects that are inserted and removed according to the last-in
 * first-out principle. Although similar in purpose, this interface differs from
 * java.util.Stack.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class ArrayStack<E> {

    public static final int CAPACITY = 1000; // default array capacity
    private E[] data; // generic array used for storage
    private int t = -1; // index of the top element in stack

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int capacity) { // constructs stack with given capacity
        data = (E[]) new Object[capacity]; // safe cast; compiler may give warning(does)
    }
    /**
     * Returns the number of elements in the stack.
     *
     * @return number of elements in the stack
     */
    public int size(){
        return (t + 1);
    }

    /**
     * Tests whether the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty(){
        return (t == -1);
    };

    /**
     * Inserts an element at the top of the stack.
     *
     * @param e the element to be inserted
     */
    public void push(E e) throws StackOverflowError{
        t = t + 1;
        data[t] =  e;
    };

    /**
     * Returns, but does not remove, the element at the top of the stack.
     *
     * @return top element in the stack (or null if empty)
     */
    public E top(){
        return data[t];
    };

    /**
     * Removes and returns the top element from the stack.
     *
     * @return element removed (or null if empty)
     */
    public E pop(){
       if(isEmpty()){
           return null;
       }
       else {
           E element = data[t];
           data[t] = null;
           t = t - 1;
           return element;
       }
    };
}