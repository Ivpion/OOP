package week4.arrayStack;

/**
 * Created by ivan on 10.07.17.
 */
public class MyArrayStack implements IStack {

    private static final int DEFAULT_STACK_SIZE = 10;

    private int index = 0;
    private Node[] list;

    public MyArrayStack() {
        this.list = new Node[DEFAULT_STACK_SIZE];
    }

    public MyArrayStack(int size) {
        this.list = new Node[size];
    }

    public void push(Node node) {
        try {
            list[index] = node;
            index++;
        } catch (IndexOutOfBoundsException e){
            e.printStackTrace();
        }


    }

    public Node pop() {
        if (index < 1){
            throw new NullPointerException();
        } else {
            Node node = list[index-1];
            list[index-1] = null;
            index--;
            return node;
        }
    }

    public int getSize() {
        return index;
    }

    public void clear() {
        index = 0;
        for (int i = 0; i < list.length;i++) {
            list[i] = null;
        }
    }

    public Node[] getList() {
        return list;
    }
}
