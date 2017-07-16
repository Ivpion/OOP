package head_first_patterns._01duckExs_Strategy;

/**
 * Created by ivan on 03.06.17.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m a real Mallard Duck!");
    }



}
