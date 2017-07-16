package week4.linkedQueue;

/**
 * Created by ivan on 04.07.17.
 */
public class TestLinkedQueue {

    public static void main(String[] args) {
        MyLinkedQueue<Integer> linkedQueue = new MyLinkedQueue<>();
        linkedQueue.enqueue(new Node<>(1));
        linkedQueue.enqueue(new Node<>(2));
        linkedQueue.enqueue(new Node<>(3));
        System.out.println(linkedQueue.getHead());
        System.out.println(linkedQueue.getTail());


        for (Integer integer : linkedQueue) {
            System.out.println(integer);
        }
    }
}
