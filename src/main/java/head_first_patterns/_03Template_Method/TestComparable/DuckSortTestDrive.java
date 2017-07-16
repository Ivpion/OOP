package head_first_patterns._03Template_Method.TestComparable;

import java.util.Arrays;

/**
 * Created by ivan on 15.06.17.
 */
public class DuckSortTestDrive {
    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("Daffy" , 9),
                new Duck("Dewey", 4),
                new Duck("Don", 5),
                new Duck("Huey", 9),
                new Duck("Donald", 7),
                new Duck("Helga", 10)
        };
        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting");
        display(ducks);


    }

    public static void display(Duck[] ducks){
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}
