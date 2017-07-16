package week4.linkedStack;

/**
 * Created by ivan on 10.07.17.
 */
public class LSNode<E> {

    private E val;
    private LSNode<E> nextNode;

    public LSNode(E val) {
        this.val = val;
    }

    public LSNode(E val, LSNode<E> node) {
        this.val = val;
        this.nextNode = node;
    }

    @Override
    public String toString() {
        String s;

        try{
        s = "LSNode{" +
                "val=" + val +
                ", node=" + nextNode.getVal() +
                '}';
        } catch (NullPointerException e){
            s = "LSNode{" +
                    "val=" + val + "}";
        }
        return s;
    }

    public E getVal() {
        return val;
    }



    public LSNode<E> getNextNode() {
        return nextNode;
    }
}
