import java.util.Scanner;

public class Menu {

    // We can use the Interface type to store an object of any class that implements the interface
    // This is called polymorphism - it means we can substitute any other class that
    // implements the interface
    private static ShoppingList shoppingList;

    /**
     * Add an item to the list
     * This method is private because it is only used by the Menu class
     * It handles the user input and passes the data to the ShoppingList class
     */
    private static void addItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item name: ");
        String name = scanner.nextLine();
        System.out.println("Enter item price: ");
        double price = scanner.nextDouble();
        System.out.println("Enter item quantity: ");
        int quantity = scanner.nextInt();
        shoppingList.addItem(new ShoppingListItem(name, price, quantity));
    }


    /**
     * Find an item in the list
     * It handles the user input and passes the data to the ShoppingList class
     */
    private static void findItem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item name: ");
        String name = scanner.nextLine();
        int index = shoppingList.findItem(name);
        if (index == -1) {
            System.out.println("Item not found!");
        } else {
            System.out.println("Item found at index " + index);
        }
    }

    private static void chooseOption(int choice) {
        switch (choice) {
            case 1:
                addItem();
                break;
            case 2:
                shoppingList.printList();
                break;
            case 3:
                findItem();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static void showOptions() {
        System.out.println("1. Add item");
        System.out.println("2. Print list");
        System.out.println("3. Find item");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        chooseOption(choice);
    }
    public static void showMenu() {
        shoppingList = new ArrayShoppingList(10);
        while (true) {
            showOptions();
        }
    }
}
