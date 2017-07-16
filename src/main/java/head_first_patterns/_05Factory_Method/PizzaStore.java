package head_first_patterns._05Factory_Method;

/**
 * Created by ivan on 26.06.17.
 */
public abstract class PizzaStore {


    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }



    protected abstract Pizza createPizza(String type);

}
