package head_first_patterns._03Template_Method;

/**
 * Created by ivan on 15.06.17.
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }
}
