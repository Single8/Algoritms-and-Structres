package linkedlist;

import java.util.Iterator;

public class LinkIterator implements Iterator<Node> {

    private LinkedListImpl linkedList;
    private Node current;
    private boolean firstIterate = true;

    public LinkIterator(LinkedList linkedList, Node current) {
        this.linkedList = (LinkedListImpl) linkedList;
        this.current = current;
        }

    @Override
    public boolean hasNext() {
            return current.getNextNode() != null;
            }

    @Override
    public Node next() {
            return current = current.getNextNode();
            }


    @Override
    public void remove() {
            linkedList.delete(current.getData());
            }
}
