package week4.arrayStack;

import java.util.Arrays;

/**
 * Created by ivan on 10.07.17.
 */
public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(10);
        stack.push(new Node(1));
        stack.push(new Node(2));
        stack.push(new Node(3));
        stack.push(new Node(4));
        stack.push(new Node(5));
        System.out.println(Arrays.toString(stack.getList()));
        System.out.println(stack.getSize());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(Arrays.toString(stack.getList()));
        System.out.println(stack.getSize());
        stack.clear();
        System.out.println(Arrays.toString(stack.getList()));
        System.out.println(stack.getSize());

    }
}
