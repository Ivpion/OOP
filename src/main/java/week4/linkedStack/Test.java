package week4.linkedStack;

/**
 * Created by ivan on 10.07.17.
 */
public class Test {
    public static void main(String[] args) {
        LSNode<Integer> node = new LSNode<>(3);
        LSNode<Integer> node1 = new LSNode<>(4);
        LSNode<Integer> node2 = new LSNode<>(4);




        IStackLS<Integer> stack = new MyLinkedStack<>();
        stack.push(node);
        stack.push(node1);
        stack.push(node2);
        /*System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.toString());
        stack.push(node2);
        System.out.println(stack.toString());
        stack.clear();
        System.out.println(stack.toString());*/

        for (Integer integer : stack) {
            System.out.println(integer);
        }

    }
}
