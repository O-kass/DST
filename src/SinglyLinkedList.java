public class SinglyLinkedList<E> {

    private static class Node<E> {

        private E element; // ref to the element stored at this node
        private Node<E> next; // ref to the subsequent node in the list

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head = null; // head node of the list (or null if empty)
    private Node<E> tail = null; // last node of the list (or null if empty)
    private int size = 0; // number of nodes in the list

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public E first() {
        return head.getElement();
    }

    public E last() {
        if(tail.getElement() == null){
            return null;
        }
        else{
            return tail.getElement();
        }
    }

    public void addFirst(E e) {
        if(size == 0){
            Node<E> newHead = new Node<>(e, null);
            head = newHead;
            tail = newHead;
            size++;
        }
        else if(size == 1){
            Node<E> newHead = new Node<>(e, head);
            tail = head;
            head = newHead;
            size++;
        }
        else {
            Node<E> newHead = new Node<>(e, head);
            head = newHead;
            size++;
        }
    }

    public void addLast(E e) {
        Node<E> newTail = new Node<>(e, null);
        if(isEmpty()){
            tail = newTail;
            head = tail;
            size++;
        }
        else {
            tail.setNext(newTail);
            tail = newTail;
            size++;
        }
    }

    public E removeFirst() {
        if(isEmpty()){
            return null;
        }
        else if(size == 1){
            Node<E> oldHead = head;
            head = null;
            tail = null;
            size--;
            return oldHead.getElement();
        }
        else if(size == 2){
            Node<E> oldHead = head;
            head = head.getNext();
            size--;
            return oldHead.getElement();
        }
        else {
            Node<E> oldHead = head;
            head = head.getNext();
            size--;
            return oldHead.getElement();
        }
    }
}