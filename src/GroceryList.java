import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> groceryList = new ArrayList<String>();

	public void addGroceryItem(String item) {
		groceryList.add(item);
	}

	public ArrayList<String> getGroceryList() {
		return groceryList;
	}

	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " item in your grocery list");
		for (int i = 0; i < groceryList.size(); i++) {
			System.out.println((i + 1) + ", " + groceryList.get(i));
		}
	}

	public void modifyGroceryItem(String currentItem, String newItem) {
		int position = FindItem(currentItem);
		if (position >= 0) {
			modifyGroceryItem(position, newItem);
		}
	}

	private void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery Item " + (position + 1) + " has been modified");
	}

	public void removeGroceryItem(String item) {
		int position = FindItem(item);
		if (position >= 0) {
			removeGroceryitem(position);
		}
	}

	private void removeGroceryitem(int position) {
		groceryList.remove(position);
	}

	private int FindItem(String searchItem) {
		return groceryList.indexOf(searchItem);

	}

	public boolean onFile(String searchItem) {
		int position = FindItem(searchItem);
		if (position >= 0) {
			return true;
		}
		return false;
	}
}
