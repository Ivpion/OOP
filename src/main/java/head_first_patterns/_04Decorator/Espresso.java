package head_first_patterns._04Decorator;

/**
 * Created by ivan on 26.06.17.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
