
/**This is a simple grocery list application 
 * that let you add, search, remove and search 
 * for previously added items.
*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;

		int choice = 0;
		printInstructions();

		while (!quit) {
			System.out.println("Enter your choices: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				processArrayList();
				break;
			case 7:
				quit = false;
				break;
			}
		}

	}

	// This is the menu of all the different things that you can do with this application.
	public static void printInstructions() {
		System.out.println("\n Press ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item from the list.");
		System.out.println("\t 6 - To quit the application.");
	}

	// This method is designed to add Item
	public static void addItem() {
		System.out.println(" Please enter the grocery Item:");
		groceryList.addGroceryItem(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.println("Enter item number: ");
		String itemNo = scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo, newItem);
	}

	public static void removeItem() {
		System.out.println("Enter item number: ");
		String itemNo = scanner.nextLine();
		groceryList.removeGroceryItem(itemNo);
	}

	public static void searchForItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		if (groceryList.onFile(searchItem)) {
			System.out.println("Found " + searchItem + " in our grocery list");
		} else {
			System.out.println(searchItem + " is not in the shopping list");
		}
	}

	public static void processArrayList() {
		ArrayList<String> newArray = new ArrayList<String>();
		newArray.addAll(groceryList.getGroceryList());

		ArrayList<String> nextArray = new ArrayList<String>();

	}
}