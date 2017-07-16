package head_first_patterns._04Decorator;

/**
 * Created by ivan on 26.06.17.
 */
public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }
}
