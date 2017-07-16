package week4.linkedStack;

import java.util.Iterator;

/**
 * Created by ivan on 10.07.17.
 */
public class MyLinkedStack<T> implements IStackLS<T> {

    private LSNode<T> top;
    private int index;


    public void push(LSNode<T> node) {
        top = new LSNode<T>(node.getVal(), top);
        index++;
    }

    public LSNode<T> pop() {
        if (top == null) throw new NullPointerException();
        LSNode<T> buff = top;
        top = top.getNextNode();
        index--;
        return buff;
    }

    public int getSize() {
        return index;
    }

    public void clear() {
        top = null;
        index = 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MyLinkedStack {");
        sb.append("top=").append(top);
        sb.append(", index=").append(index);
        sb.append("}");
        return sb.toString();
    }


    @Override
    public Iterator<T> iterator() {
        return new LinkedStackIterator();
    }

    private class LinkedStackIterator implements Iterator<T>{

        private LSNode<T> curr = top;

        @Override
        public boolean hasNext() {
            return top != null;
        }

        @Override
        public T next() {
            LSNode<T> buff = top;
            top = top.getNextNode();
            return buff.getVal();
        }
    }
}
