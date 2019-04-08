package linkedlist;

public interface LinkedList {

    void insert(Person data);

    Person delete();

    void display();

    boolean isEmpty();

    boolean contains(Person value);

    boolean delete(Person value);

    Person getFirst();

    int getSize();

    LinkIterator iterator();
}
