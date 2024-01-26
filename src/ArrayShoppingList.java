import java.util.Objects;

public class ArrayShoppingList implements ShoppingList {
    // ShoppingList is an array of ShoppingListItems
    private ShoppingListItem[] items;
    // lastItemIndex is the index of the last item in the list
    int lastItemIndex = 0;

    /**
     * Create a new shopping list
     * @param maxItems the maximum number of items allowed in the list
     */
    public ArrayShoppingList(int maxItems) {
        this.items = new ShoppingListItem[maxItems];
    }

    /**
     * Add an item to the list
     * @param item the item to add
     */
    @Override
    public void addItem(ShoppingListItem item) {
        if (lastItemIndex < items.length) {
            items[lastItemIndex] = item;
            lastItemIndex++;
        } else {
            System.out.println("List is full!");
        }
    }

    /**
     * Print the list of items
     */
    @Override
    public void printList() {
        for (int i = 0; i < lastItemIndex; i++) {
            System.out.println(items[i]);
        }
    }

    /**
     * Find an item in the list by name
     * @param name
     * @return index of item in list, or -1 if not found
     */
    @Override
    public int findItem(String name) {
        for (int i = 0; i < lastItemIndex; i++) {
            if (Objects.equals(items[i].getName(), name)) {
                System.out.println(items[i]);
                return i;
            }
        }
        return -1;
    }
}
