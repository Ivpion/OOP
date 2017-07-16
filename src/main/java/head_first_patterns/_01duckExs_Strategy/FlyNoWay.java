package head_first_patterns._01duckExs_Strategy;

/**
 * Created by ivan on 03.06.17.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can`t fly(");
    }
}
