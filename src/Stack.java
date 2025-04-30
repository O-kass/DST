/**
 * A collection of objects that are inserted and removed according to the last-in
 * first-out principle. Although similar in purpose, this interface differs from
 * java.util.Stack.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class Stack<E> {

    /**
     * Returns the number of elements in the stack.
     *
     * @return number of elements in the stack
     */
    public int size(){
        int hello = 5;
        return hello;
    }

    /**
     * Tests whether the stack is empty.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty(){
        boolean b = false;
        return b;
    };

    /**
     * Inserts an element at the top of the stack.
     *
     * @param e the element to be inserted
     */
    public void push(E e){

    };

    /**
     * Returns, but does not remove, the element at the top of the stack.
     *
     * @return top element in the stack (or null if empty)
     */
    public E top(){
        E e = null;
        return e;
    };

    /**
     * Removes and returns the top element from the stack.
     *
     * @return element removed (or null if empty)
     */
    public E pop(){
        E e = null;
        return e;
    };
}