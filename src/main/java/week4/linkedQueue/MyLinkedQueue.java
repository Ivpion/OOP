package week4.linkedQueue;



import java.util.Iterator;

/**
 * Created by ivan on 30.06.17.
 */
public class MyLinkedQueue<T> implements IQueueForLinked<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;


    public void enqueue(Node<T> t) {
        if (t == null) throw new NullPointerException();
        if (head == null){
            head = t;
            tail = t;
        } else {
            tail.setNextNode(t);
            tail = t;
        }
    }

    public Node<T> dequeue() {
        if (head == null) throw new NullPointerException();
        Node<T> buff = head;
        head = head.getNextNode();
        count--;

        if (count == 0){
            head = null;
            tail = null;
        }
        return buff;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedQueueIterator();
    }

    private class LinkedQueueIterator implements Iterator<T>{

        private Node<T> curr = head;

        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            Node<T> forRes = curr;
            curr = curr.getNextNode();
            return forRes.getValue();
        }
    }
}
