package week4.linkedQueue;

/**
 * Created by ivan on 04.07.17.
 */
public interface IQueueForLinked<E> extends Iterable<E> {

    public void enqueue(Node<E> t);

    Node<E> dequeue();

    public void clear();

    public int getSize();
}
