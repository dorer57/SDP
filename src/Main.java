public class Main {

    public static void main(String[] args) {

        Pizza thinPizza = new ThinCrustPizzaBuilder()
                .setSize("35cm")
                .setSauce("Tomato")
                .setCheese("Mozzarella")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .build();

        Pizza thickPizza = new ThickCrustPizzaBuilder()
                .setSize("30cm")
                .setSauce("Pesto")
                .setCheese("Cheddar")
                .addTopping("Chicken")
                .addTopping("Onion")
                .build();

        System.out.println(thinPizza);
        System.out.println(thickPizza);
    }
}