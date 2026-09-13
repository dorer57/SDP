This project demonstrates the Builder design pattern in Java. The product here is a Pizza, which could have different sizes, dough types (thick or thin), sauces, cheese, and toppings. It allows to conveniently build custom pizzas.

Project Structure:

- "Pizza" - the product class
- "PizzaBuilder" - the builder interface
- "ThinCrustPizzaBuilder" - builds pizza with thin crust
- "ThickCrustPizzaBuilder" - builds pizza with thick crust
- "Main" - sets parameters for pizzas

Example:

A pizza can be created like this:

Pizza pizza = new ThinCrustPizzaBuilder()
        .setSize("Large")
        .setSauce("Tomato")
        .setCheese("Mozzarella")
        .addTopping("Pepperoni")
        .build();
Where in ("brackets") could be typed anything, which would be as pizza's setting.
