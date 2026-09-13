public interface PizzaBuilder {
    PizzaBuilder setSize(String size);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder setCheese(String cheese);
    PizzaBuilder addTopping(String topping);
    Pizza build();
}