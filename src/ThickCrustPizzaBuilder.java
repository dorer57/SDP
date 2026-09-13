import java.util.ArrayList;
import java.util.List;

public class ThickCrustPizzaBuilder implements PizzaBuilder {

    private String size;
    private String sauce;
    private String cheese;
    private List<String> toppings = new ArrayList<>();

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(
                size,
                "Thick Crust",
                sauce,
                cheese,
                toppings
        );
    }
}