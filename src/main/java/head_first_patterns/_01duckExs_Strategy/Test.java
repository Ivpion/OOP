package head_first_patterns._01duckExs_Strategy;

/**
 * Created by ivan on 03.06.17.
 */
public class Test {
    public static void main(String[] args) {
        Duck mallardDuck = new  MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

    }
}
