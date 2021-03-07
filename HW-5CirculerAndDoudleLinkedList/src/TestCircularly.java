public class TestCircularly {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> ci = new CircularlyLinkedList();
        CircularlyLinkedList<Integer> ci2 = new CircularlyLinkedList();
        CircularlyLinkedList<Integer> c3 = new CircularlyLinkedList();
        ci.addFirst(4);
        ci.addLast(5);
        ci.addLast(6);
        ci2.addLast(4);
        ci2.addLast(5);
        ci2.addLast(6);
       // System.out.println(ci2.size());
        System.out.println(c3.equals(ci,ci2));;
        int size = ci.size();
        for (int i = 0; i < size; i++) {
            System.out.println(ci.first());
            ci.rotate(); }
        System.out.println(ci.size()); }}
