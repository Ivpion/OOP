package head_first_patterns._03Template_Method;

/**
 * Created by ivan on 15.06.17.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void pourInCup() {
        System.out.println("Pouring in to cup");
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void boilWater() {
        System.out.println(" Boiling water");
    }
}
