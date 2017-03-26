package restaurant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Table {
    private HashMap<Integer, MenuItem> order = new HashMap<>();
    private Map<String, MenuItem> menu = new HashMap<>();
    private int orderCount, orderNum;
    
    public Table(Map<String, MenuItem> restaurantMenu) {
        orderCount = 0;
        orderNum = 0;
        menu = restaurantMenu;        
    }
    
    private MenuItem FindEntry(String searchTerm) {
        /*
        Precondition:
            1) Search Term is valid. (Case is modified to lowercase during search)
            2) Menu is properly loaded.
        Postcondition:
            1) If search term is matched with key, the value (MenuItem Object) will be returned.
            2) If search term is not matched, the value will be returned null.
        Notes: A null must be checked for by calling function.
        */
        
        Iterator<HashMap.Entry<String, MenuItem>> entries = menu.entrySet().iterator();
        MenuItem value = null;
        
        while (entries.hasNext()) {
            HashMap.Entry<String, MenuItem> entry = entries.next();
            if((entry.getKey().toLowerCase()).compareTo(searchTerm.toLowerCase()) == 0){
                value = entry.getValue();
            }    
        }
        return value; //This is a MenuItem object that is either the value in HashMap or null.
    }
    
    private void InterateMenu() {
        Iterator<HashMap.Entry<String, MenuItem>> entries = menu.entrySet().iterator();
        System.out.println("Available Choices:");
        while (entries.hasNext()) {
            HashMap.Entry<String, MenuItem> entry = entries.next();
            System.out.println("    " + entry.getKey()); 
        }
        System.out.println();
    }
    
    public void AddOrderItem() {
        String search;
        Scanner kbd = new Scanner(System.in);
        MenuItem searchResult, invUpdate;
        
        //Enter Search Term (will eventually be hardcoded into GUI)
        System.out.print("Enter Food Item: ");
        search = kbd.nextLine();
        kbd.close();
        searchResult = FindEntry(search);
        
        //Currently Checks for null, Will be coded out after GUI implementation.
        if(searchResult != null && searchResult.getInventory() > 0) {
            //Adds MenuItem Object to the Order HashMap
            order.put(orderNum, searchResult);
            orderNum++;
            orderCount++;
            //Update Inventory
            searchResult.setInventory(-1);
            menu.put(search,searchResult);
        } else { //Will not be an option once hardcode GUI. Button will be greyed out.
            System.out.println("Item does not exist or out of stock.");
        }
    }
    
    public void DeleteOrderItem() {
        
    }
    
    public void CalculateBill() {
        double subtotal, tax, tip, total;
        
        
        
    }
    
    public void StoreBill(double billTotal) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("billsummary.txt", true));
        
        out.println("current date");
        out.println(billTotal);
        out.close();
    }
    
    public Map<String, MenuItem> UpdateMenu() {
        return menu;
    }
	
}
