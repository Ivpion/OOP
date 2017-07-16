package head_first_patterns._01duckExs_Strategy;

/**
 * Created by ivan on 03.06.17.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack!!!");
    }
}
