package head_first_patterns._04Decorator;

/**
 * Created by ivan on 26.06.17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "DarkRoast";
    }
    public double cost() {
        return .99;
    }
}
