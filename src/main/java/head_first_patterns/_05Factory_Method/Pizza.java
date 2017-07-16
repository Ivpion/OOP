package head_first_patterns._05Factory_Method;

import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.cheese.Cheese;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.clams.Clams;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.dough.Dough;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.pepperoni.Pepperoni;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.sauce.Sauce;
import head_first_patterns._05Factory_Method.ingredientFactory.ingredients.veggies.Veggies;

import java.util.Arrays;

/**
 * Created by ivan on 26.06.17.
 */
public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    protected abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
