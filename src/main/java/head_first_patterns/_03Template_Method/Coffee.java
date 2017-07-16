package head_first_patterns._03Template_Method;

/**
 * Created by ivan on 15.06.17.
 */
public class Coffee extends CaffeineBeverage{
    @Override
    protected void addCondiments() {
        System.out.println("Adding Sugar and milk");
    }

    @Override
    protected void brew() {
        System.out.println("Drop Coffee through filter");
    }
}
