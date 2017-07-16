package head_first_patterns._05Factory_Method.ingredientFactory;

import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.cheese.Cheese;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.clams.Clams;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.dough.Dough;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.pepperoni.Pepperoni;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.sauce.Sauce;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.veggies.Veggies;

/**
 * Created by ivan on 27.06.17.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}
