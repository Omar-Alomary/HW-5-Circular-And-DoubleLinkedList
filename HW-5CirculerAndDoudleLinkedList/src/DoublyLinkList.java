import java.util.ArrayList;
import java.util.Arrays;
public class DoublyLinkList<E> {
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkList() {
        header = new Node<E>(null, null, null);
        trailer = new Node<E>(null, header, null);
        header.setNext(trailer); }
    public boolean isEmpty() {
        return size == 0;
    }
    // Question R-3.11
    public int size() {
        int sizeNode = 0;
        if (header.getNext() != trailer){
            Node<E> first = header.getNext();
            Node<E> last = trailer.getPrev();
            while (true){
                if (first == last){
                    sizeNode++;
                    break; }
                first = first.next;
                sizeNode++;
            } }return sizeNode;
    }// Question R-3.16
    public boolean equals(DoublyLinkList<E> first, DoublyLinkList<E> second){
        Node<E> firstNode = first.header.getNext();
        Node<E> secondNode = second.header.getNext();
        if (first.size() == second.size()){
            for (int i = 0; i < first.size; i++) {
                E fEle = firstNode.getElement();
                E sEle = secondNode.getElement();
                if (fEle != sEle){return false;}
                firstNode = firstNode.getNext();
                secondNode = secondNode.getNext();
            } }else {return false;}
        return true;
    }// Question C-3.35
    public DoublyLinkList<E> clone(){
        DoublyLinkList<E> cur = new DoublyLinkList<>();
        Node<E> curNode = header.next;
        for (int i = 0; i < size(); i++) {
            cur.addLast(curNode.getElement());
            curNode = curNode.getNext(); }return cur;
    }public E first() {
        if (isEmpty()) return null;
        return header.getNext().getElement();
    }public E last() {
        ArrayList<String> d = new ArrayList<>();
        if (isEmpty()) return null;
        return trailer.getPrev().getElement();
    }private void addBetween(E element, Node<E> p, Node<E> s) {
        Node<E> newest = new Node<E>(element, p, s);
        p.setNext(newest);
        s.setPrev(newest);size++;
    }public void addFirst(E element) {
        addBetween(element, header, header.getNext());
    }public void addLast(E element) {
        addBetween(element, trailer.getPrev(), trailer);
    }private E remove(Node<E> x) {
        if (isEmpty()) return null;
        Node<E> p = x.getPrev();
        Node<E> s = x.getNext();
        p.setNext(s);s.setPrev(p);
        size--;return x.getElement();
    }public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev()); }
    private static class Node<E> {
        private E element;
        private Node<E> prev;
        private Node<E> next;
        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next; }
        public E getElement() {
            return element;
        }
        public void setElement(E element) {
            this.element = element; }
        public Node<E> getPrev() {
            return prev; }
        public void setPrev(Node<E> prev) {
            this.prev = prev; }
        public Node<E> getNext() {
            return next; }
        public void setNext(Node<E> next) {
            this.next = next; }}}

