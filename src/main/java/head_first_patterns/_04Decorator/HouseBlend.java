package head_first_patterns._04Decorator;

/**
 * Created by ivan on 26.06.17.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "HouseBlend";
    }

    public double cost() {
        return .89;
    }
}
