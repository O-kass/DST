import java.util.EmptyStackException;

public class LinkedStack<T> {
    protected static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    protected Node<T> top;
    protected Node<T> tail;
    private int size;

    public LinkedStack() {
        this.top = null;
        this.tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        // Add your code here
        return (size == 0);
    }

    public void push(T element) {
        // Add your code here
        Node<T> node = new Node<>(element);
        node.next = top;
        top = node;
        size++;
    }

    public T pop() {
        // Add your code here
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        size--;
        return data;

    }

    public T peek() {
        // Add your code here
        if(isEmpty()){
            throw new EmptyStackException("STACK IS EMPTY");
        }
        else{
            return top.data;
        }
    }

    public int size() {
        // Add your code here
        return size;
    }
}
