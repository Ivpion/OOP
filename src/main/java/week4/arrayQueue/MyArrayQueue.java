package week4.arrayQueue;
import org.jetbrains.annotations.NotNull;
import week4.IQueue;

import java.util.Iterator;

/**
 * Created by ivan on 29.06.17.
 */
public class MyArrayQueue<U> implements IQueue<U> {


    private static final int DEFAULT_SIZE = 16;

    private int head;
    private int tail;
    private U[] mas;
    private int size;


    public MyArrayQueue(int size) {
        mas = (U[]) new Object[size];
    }

    public MyArrayQueue() {
        mas = (U[]) new Object[DEFAULT_SIZE];
    }

    public void enqueue(U o) {
        if (tail == mas.length) System.out.println("queue is full");
        mas[tail] = o;
        tail++;
        size++;
    }

    public U dequeue() {
        if (size == 0) {
            throw new NullPointerException();
        }
        U buff = mas[head];
        mas[head] = null;
        head++;
        size--;
        return buff;
    }

    public void clear() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = null;
        }
        head = 0;
        tail = 0;
        size = 0;

    }

    public int getSize() {
        return size;
    }

    @NotNull
    @Override
    public Iterator<U> iterator() {
        return new ArrayQueueIterator();
    }

    private class ArrayQueueIterator implements Iterator<U>{

        private int curr = head;

        @Override
        public boolean hasNext() {
            return curr < tail;
        }

        @Override
        public U next() {
            U forRet = mas[curr];
            curr++;
            return forRet;
        }
    }
}
