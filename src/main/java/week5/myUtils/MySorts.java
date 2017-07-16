package week5.myUtils;

/**
 * Created by ivan on 12.07.17.
 */
public class MySorts {

    public static void getKey(int key, int start, int end, int count) {

        int search = start + (end - start) / 2;

        if (key > search) {
            start = search;
        } else if (key < search) {
            end = search;
        }

        if (search != key) {
            count++;
            getKey(key, start, end, count);
        } else
            System.out.println("Number " + search + " Kill " + count + " stack");
    }
}
