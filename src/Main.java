import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> toppings = new ArrayList<>();

        toppings.add("Pepperoni");
        toppings.add("Mushrooms");
        toppings.add("waddsad")

        Pizza pizza = new Pizza(
                "Large",
                "Thin Crust",
                "Tomato",
                "Mozzarella",
                toppings
        );

        System.out.println(pizza);
    }
}