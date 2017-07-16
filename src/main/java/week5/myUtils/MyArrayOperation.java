package week5.myUtils;

/**
 * Created by ivan on 12.07.17.
 */
public class MyArrayOperation {

    public static int[] genRandomArray(int size, int minValue, int maxValue){
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = minValue + (int) (Math.random() * (maxValue - minValue));
        }
        return arr;
    }
    public static void bubbleSort(int[] mas){
        int temp = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length-i; j++) {
                if (mas[j-1] > mas[j]){
                    temp = mas[j-1];
                    mas[j-1]= mas[j];
                    mas[j] = temp;
                }
            }
        }
    }

    public static void insertionSort(int[] mas){
        for (int i = 1; i < mas.length; i++) {
            int temp = mas[i];
            for (int j = i - 1; j >=0 && temp < mas[j]; j--) {
                mas[j +1] = mas[j];
                mas[j+1] = temp;
            }
        }
    }
}
