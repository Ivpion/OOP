package week4.arrayStack;

/**
 * Created by ivan on 10.07.17.
 */
public interface IStack {

    void push(Node node);

    Node pop();

    int getSize();

    void clear();
}
