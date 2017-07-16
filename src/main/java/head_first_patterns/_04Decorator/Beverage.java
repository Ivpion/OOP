package head_first_patterns._04Decorator;

/**
 * Created by ivan on 26.06.17.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
