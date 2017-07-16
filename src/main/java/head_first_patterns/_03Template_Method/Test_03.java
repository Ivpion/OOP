package head_first_patterns._03Template_Method;

/**
 * Created by ivan on 15.06.17.
 */
public class Test_03 {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
