package week5;

import week5.myUtils.MyArrayOperation;
import week5.myUtils.TimeAction;
import week5.myUtils.TimeCounter;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ivan on 12.07.17.
 */
public class TestMyArrayUtils {
    public static void main(String[] args) {
        int[] arr = MyArrayOperation.genRandomArray(10, 0, 10);

        Arrays.sort(arr);


        //MySorts.getKey(556, 1, 5000, 0);

        int[] mas = MyArrayOperation.genRandomArray(50000, 0, 1000);
        int[] mas2 = MyArrayOperation.genRandomArray(50000, 0, 1000);
        int[] mas1 = MyArrayOperation.genRandomArray(50000, 0, 1000);
        TimeAction timeAction = new TimeAction() {
            @Override
            public void callWrappedAction() {
                MyArrayOperation.bubbleSort(mas);
            }
        };


        long time = TimeCounter.countActionTime(timeAction);
        System.out.println("Bubble sort ms: " + time);

        TimeAction timeAction1 = new TimeAction() {
            @Override
            public void callWrappedAction() {
                MyArrayOperation.insertionSort(mas1);
            }
        };

        long insTime = TimeCounter.countActionTime(timeAction1);
        System.out.println("Insertion sort ms: " + insTime);

        TimeAction arrSortAct = new TimeAction() {
            @Override
            public void callWrappedAction() {
                Arrays.sort(mas2);
            }
        };
        List list = new LinkedList();
        System.out.println("Array.sort ms: " + TimeCounter.countActionTime(arrSortAct));
    }


}
