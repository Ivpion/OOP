package head_first_patterns._05Factory_Method;

/**
 * Created by ivan on 26.06.17.
 */
public class ChicagoPizzaFactory extends PizzaStore {
    protected Pizza createPizza(String item) {
    /*    if (item.equals("cheese")) return new ChicagoStyleCheesePizza();
        if (item.equals("veggie")) return new ChicagoStyleVeggiePizza();
        if (item.equals("clam")) return new ChicagoSeyleClamPizza();
        if (item.equals("pepperoni")) return new ChicagoStilePepperoniPizza();*/
        //else
            return null;
    }
}
