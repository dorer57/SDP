import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private String sauce;
    private String cheese;
    private List<String> toppings;

    public Pizza(String size, String dough, String sauce,
                 String cheese, List<String> toppings) {

        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza - size=" + size +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", toppings=" + toppings;
    }
}