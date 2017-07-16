package head_first_patterns._05Factory_Method.ingredientFactory;

import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.cheese.Cheese;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.cheese.ReggianoCheese;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.clams.Clams;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.clams.FreshClams;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.dough.Dough;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.dough.ThinCrustDough;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.pepperoni.Pepperoni;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.pepperoni.SlicedPepperoni;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.sauce.MarinaraSauce;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.sauce.Sauce;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.veggies.*;

/**
 * Created by ivan on 27.06.17.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
