package week4.linkedStack;

/**
 * Created by ivan on 10.07.17.
 */
public interface IStackLS<U> extends Iterable<U>{

    void push(LSNode<U> node);

    LSNode<U> pop();

    int getSize();

    void clear();
}
