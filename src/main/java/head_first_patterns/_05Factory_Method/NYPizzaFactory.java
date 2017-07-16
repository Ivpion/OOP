package head_first_patterns._05Factory_Method;

import head_first_patterns._05Factory_Method.ingredientFactory.NYPizzaIngredientFactory;
import head_first_patterns._05Factory_Method.ingredientFactory.PizzaIngredientFactory;
import head_first_patterns._05Factory_Method.pizzaVariable.CheesePizza;
import head_first_patterns._05Factory_Method.pizzaVariable.ClamPizza;
import head_first_patterns._05Factory_Method.pizzaVariable.PeperoniPizza;
import head_first_patterns._05Factory_Method.pizzaVariable.VeggiePizza;

/**
 * Created by ivan on 26.06.17.
 */
public class NYPizzaFactory extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("NY Style Cheese Pizza");

        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NY Style Veggie Pizza");

        } else if (item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NY Style Clam Pizza");

        } else if (item.equals("pepperoni")){
            pizza = new PeperoniPizza(ingredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        }
        return pizza;
    }
}

