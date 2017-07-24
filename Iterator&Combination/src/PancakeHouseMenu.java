import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;
    
    public PancakeHouseMenu() {
    	menuItems = new ArrayList();
    	
    	addItem("K&B Pancake Breakfast", "Pancake with scrambled eggs, and toast", true, 2.99);
    	addItem("Regular Pamcakse Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
    	addItem("Blueberry Pancake", "Pancake made with fresh blueberries", true, 3.49);
    }
    
    public void addItem (String name, String description, boolean vegetarian, double price) {
    	MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
    	menuItems.add(menuItem);
    }
    
    public ArrayList getMenuItems(){
    	return menuItems;
    }
    
    public Iterator createIterator() {
    	return new PancakeHouseMenuIterator(menuItems);
    }
}
