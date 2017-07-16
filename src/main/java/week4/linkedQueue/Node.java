package week4.linkedQueue;

/**
 * Created by ivan on 04.07.17.
 */
public class Node<U> {

    private U value;
    private Node<U> nextNode;

    public Node(U value) {
        this.value = value;
        this.nextNode = null;
    }


    public Node(U value, Node<U> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

    public U getValue() {
        return value;
    }

    public void setValue(U value) {
        this.value = value;
    }

    public Node<U> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<U> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        String s;
        try {
            return s = "Node{" +
                    "value=" + value +
                    ", nextNode=" + nextNode.getValue() +
                    '}';
        } catch (NullPointerException e){
          s =  "Node{ " + "value= " + value + "}";
    }
    return s;
}


}



