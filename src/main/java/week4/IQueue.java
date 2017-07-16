package week4;

/**
 * Created by ivan on 29.06.17.
 */
public interface IQueue<T> extends Iterable<T> {

    public void enqueue(T t);

    T dequeue();

    public void clear();

    public int getSize();


}
