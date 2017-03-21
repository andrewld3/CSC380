package restaurant;

import java.util.Map;
import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.ArrayList;

public class Restaurant {

    public static Map<String, MenuItem> menu = new HashMap<String, MenuItem>();

    public void loadMenu(String name, double price, int inventory) {

        MenuItem item = new MenuItem(name, price, inventory);
        menu.put(item.getName(), item);

    }
}
