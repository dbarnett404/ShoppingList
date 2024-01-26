import static org.junit.jupiter.api.Assertions.*;

class ArrayShoppingListTest {
private ArrayShoppingList list;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        list = new ArrayShoppingList(10);
        list.addItem(new ShoppingListItem("Milk", 0.89, 1));
        list.addItem(new ShoppingListItem("Bread", 0.99, 2));
        list.addItem(new ShoppingListItem("Eggs", 1.99, 1));
        list.addItem(new ShoppingListItem("Cheese", 1.49, 1));
        list.addItem(new ShoppingListItem("Butter", 0.89, 1));
    }

    @org.junit.jupiter.api.Test
    void addItem() {
        assertEquals(5, list.lastItemIndex);
    }

    @org.junit.jupiter.api.Test
    void printList() {
        list.printList();
    }

    @org.junit.jupiter.api.Test
    void findItem() {
        assertEquals(0, list.findItem("Milk"));
    }
}