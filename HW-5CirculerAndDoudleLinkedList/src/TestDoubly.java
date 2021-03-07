
public class TestDoubly {
    public static void main(String[] args) {
        DoublyLinkList<Integer> doubly = new DoublyLinkList<>();
        DoublyLinkList<Integer> doubly2 = new DoublyLinkList<>();
        DoublyLinkList<Integer> doubly3 = new DoublyLinkList<>();

        doubly.addLast(11);
        doubly.addLast(12);
        doubly.addLast(13);
        doubly.addLast(15);

        doubly2 = doubly.clone();
        doubly2.addLast(11);
        doubly2.addLast(12);
        doubly2.addLast(13);

        System.out.println(doubly3.equals(doubly,doubly2));
        int size = doubly2.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            System.out.println(doubly2.removeLast());
        } }}
