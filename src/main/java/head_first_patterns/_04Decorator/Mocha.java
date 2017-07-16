package head_first_patterns._04Decorator;

/**
 * Created by ivan on 26.06.17.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
