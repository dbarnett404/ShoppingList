import java.util.Objects;

public class ShoppingListItem {
    private String name;
    private int quantity;
    private double price;

    public ShoppingListItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingListItem that = (ShoppingListItem) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ". £" + price + " ("+ this.quantity + ")";
    }
}
