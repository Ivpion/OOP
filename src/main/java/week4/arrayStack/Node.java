package week4.arrayStack;

/**
 * Created by ivan on 10.07.17.
 */
public class Node<T> {
   private int val;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}
