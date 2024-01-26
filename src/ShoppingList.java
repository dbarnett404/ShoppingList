public interface ShoppingList {
    void addItem(ShoppingListItem item);

    void printList();

    int findItem(String name);
}
