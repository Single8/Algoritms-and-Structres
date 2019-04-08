package linkedlist;

public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedListImpl();
        final Person anna = new Person(7, "Anna");
        linkedList.insert(anna);
        final Person oleg = new Person(10, "Oleg");
        linkedList.insert(oleg);
        final Person pavel = new Person(15, "Pavel");
        linkedList.insert(pavel);

//        linkedList.delete(oleg);
//        linkedList.delete();

//        System.out.println("Contains Anna: " + linkedList.contains(anna));

        linkedList.display();

        LinkIterator iterator = linkedList.iterator();
        LinkIterator iterator2 = linkedList.iterator();

        System.out.println("Removing...");
        while (iterator.hasNext()) {
            iterator.remove();
            iterator.next();
        }

        iterator.remove();

        System.out.println("After remove...");
        linkedList.display();
    }
}
