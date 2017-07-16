package week4.arrayQueue;

import week4.IQueue;

import java.util.Iterator;

/**
 * Created by ivan on 30.06.17.
 */
public class TestArrayQueue {
    public static void main(String[] args) {
        IQueue<Integer> arr = new MyArrayQueue<>();

        arr.enqueue(12);
        arr.enqueue(234);
        arr.enqueue(555);
        System.out.println(arr.getSize());


        Iterator<Integer> it = arr.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
