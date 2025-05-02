public class DoublyLinkedList<E> {

    private static class Node<E> {

        private E element; // ref to the element stored at this node
        private Node<E> prev; // ref to the prev node in the list
        private Node<E> next; // ref to the subsequent node in the list

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            next = n;
            prev = p;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> header; // header sentinel
    private Node<E> trailer; // trailer sentinel
    private int size = 0; // number of nodes in the list

    public DoublyLinkedList() {
        header = new Node<>(null, null, null); // create header
        trailer = new Node<>(null, header, null); // trailer is preceded by header
        header.setNext(trailer); // header is followed by trailer
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public E first() {
        if(isEmpty()){
            return null;
        }
        else{
            return header.getNext().getElement();
        }
    }

    public E last() {
        if(size == 0){
            return null;
        }
        else{
            return trailer.getPrev().getElement();
        }
    }

    public void addFirst(E e) {
        if(size==0){
            Node<E> first = new Node<E>(e, header, trailer);
            header.setNext(first);
            trailer.setPrev(first);
            size++;
        }
        else{
            Node<E> oldFirst = header.getNext();
            Node<E> first = new Node<E>(e, header, oldFirst);
            oldFirst.setPrev(first);
            header.setNext(first);
            size++;
        }
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(),trailer);
    }

    public E removeFirst() {
        if(size==0){
            return null;
        }
        else{
            return remove(header.getNext());
        }
    }

    public E removeLast() {
        if(isEmpty()){
            return null;
        }
        else{
            return remove(trailer.getPrev());
        }
    }

    /**
     * Adds element e to the linked list in between the given nodes.
     */
    private void addBetween(E e, Node<E> predecessor, Node<E> successor) {

            Node<E> first = new Node<E>(e, predecessor, successor);
            successor.setPrev(first);
            predecessor.setNext(first);
            size++;

    }

    /**
     * Removes the given node from the list and returns its element.
     */
    private E remove(Node<E> node) {
        Node<E> removed = node;
        Node<E> predecessor = removed.getPrev();
        Node<E> successor = removed.getNext();

        predecessor.setNext(successor);
        successor.setPrev(predecessor);

        size--;
        return removed.getElement();
    }
}