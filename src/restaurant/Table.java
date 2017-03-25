package restaurant;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Table {
    private HashMap<Integer, MenuItem> order = new HashMap<>();
    private Map<String, MenuItem> menu = new HashMap<>();
    private int orderCount, orderNum;
    
    public Table(Map<String, MenuItem> restaurantMenu) {
        String searchTerm;
        MenuItem result;
        Scanner kbd = new Scanner(System.in);
        orderCount = 0;
        orderNum = 0;
        menu = restaurantMenu;
        System.out.print("Search Term: ");
        searchTerm = kbd.nextLine();
        result = FindEntry(searchTerm);
        System.out.println(result.getName());
        
    }
    
    private MenuItem FindEntry(String searchTerm) {
        Iterator<HashMap.Entry<String, MenuItem>> entries = menu.entrySet().iterator();
        MenuItem value = null;
        while (entries.hasNext()) {
            HashMap.Entry<String, MenuItem> entry = entries.next();
            if((entry.getKey()).compareTo(searchTerm) == 0){
                value = entry.getValue();
                System.out.println("Should be here");
            }    
        }
        return value;
    }
    
    public void AddOrderItem() {
        
    }
	
}
