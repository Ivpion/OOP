package head_first_patterns._05Factory_Method;

/**
 * Created by ivan on 27.06.17.
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaFactory();
      //  PizzaStore chicagoStore = new ChicagoPizzaFactory();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ivan ordered a " + pizza.getName() + "\n");

        //pizza = chicagoStore.orderPizza("cheese");
       // System.out.println("Joel ordered a " + pizza.getName());
    }
}
