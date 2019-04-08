package linkedlist;

public class TwoWayLinkedListMain {

    public static void main(String[] args) {
        TwoWayLinkedList linkedList = new TwoWayLinkedList();
        final Person anna = new Person(7, "Anna");
        linkedList.insert(anna);
        final Person oleg = new Person(10, "Oleg");
        linkedList.insert(oleg);
        final Person pavel = new Person(15, "Pavel");
        linkedList.insert(pavel);
        final Person sveta = new Person(25, "Sveta");

//        linkedList.delete(oleg);
//        linkedList.delete();

        linkedList.insertLast(sveta);

        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.delete());
        }

        System.out.println("Contains Anna: " + linkedList.contains(anna));

        linkedList.display();
    }
}
