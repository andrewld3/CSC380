package restaurant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Table {
    private String order[];
    private int orderNum[];
    private Map<String, MenuItem> menu = new HashMap<>();
    
    public Table(Map<String, MenuItem> restaurantMenu) {
        menu = restaurantMenu;
        order = new String[menu.size()];
        orderNum = new int[menu.size()];
        IterateMenu();
        SetZeroOrder();
        
        for(int i = 0; i < menu.size(); i++) {
            System.out.println(order[i]);
            System.out.println(orderNum[i]);
        }
    }
    
    private String FindEntry(String searchTerm) {
        /*
        Precondition:
            1) Search Term is valid. (Case is modified to lowercase during search)
            2) Menu is properly loaded.
        Postcondition:
            1) If search term is matched with key, the key will be returned.
            2) If search term is not matched, the key will be returned null.
        Notes: A null must be checked for by calling function.
        */
        
        Iterator<HashMap.Entry<String, MenuItem>> entries = menu.entrySet().iterator();
        String value = null;
        
        while (entries.hasNext()) {
            HashMap.Entry<String, MenuItem> entry = entries.next();
            if((entry.getKey().toLowerCase()).compareTo(searchTerm.toLowerCase()) == 0){
                value = entry.getKey();
            }    
        }
        return value; //This is either the key of the Hashmap or Null
    }
    
    private void IterateMenu() {
        Iterator<HashMap.Entry<String, MenuItem>> entries = menu.entrySet().iterator();
        int i = 0;
        
        while (entries.hasNext()) {
            HashMap.Entry<String, MenuItem> entry = entries.next();
            order[i] = entry.getKey();
            i++;
        }
    }
    
    private void SetZeroOrder() {
        for(int i = 0; i < menu.size(); i++)
            orderNum[i] = 0;
    }
    
    public void AddOrderItem() {
        
    }
    
    public void DeleteOrderItem() {
        
    }
    
    public void CalculateBill() {
   
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
