package head_first_patterns._05Factory_Method.pizzaVariable;

import head_first_patterns._05Factory_Method.Pizza;
import head_first_patterns._05Factory_Method.ingredientFactory.PizzaIngredientFactory;

/**
 * Created by ivan on 27.06.17.
 */
public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    protected void prepare() {
        System.out.println("Preparing "  + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClams();
    }
}
