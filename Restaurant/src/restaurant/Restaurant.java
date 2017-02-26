package restaurant;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Restaurant {

    public static Map<String, MenuItem> menu = new HashMap<String, MenuItem>();;
    
    public void loadMenu(String name, double price, int inventory){
        
        MenuItem item = new MenuItem(name, price ,inventory);
        menu.put(item.getName(), item);
        
    }
    
    public static void main(String [] args){
        menu = new HashMap<String, MenuItem>();
        MenuItem item = new MenuItem("hamburger", 12.5 ,50);
        //System.out.println("test");
        menu.put(item.getName(), item);
        item = new MenuItem("hotdog", 5.5, 50);
        menu.put(item.getName(), item);
        System.out.println(menu.get("hamburger").getName() +"\n" + menu.get("hamburger").getPrice() + "\n" + menu.get("hamburger").getInventory());
        System.out.println("test");
    }
    
}
