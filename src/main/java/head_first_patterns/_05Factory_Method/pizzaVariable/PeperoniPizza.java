package head_first_patterns._05Factory_Method.pizzaVariable;

import head_first_patterns._05Factory_Method.Pizza;
import head_first_patterns._05Factory_Method.ingredientFactory.PizzaIngredientFactory;

/**
 * Created by ivan on 27.06.17.
 */
public class PeperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PeperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.ingredientFactory = pizzaIngredientFactory;
    }

    protected void prepare() {

    }
}
