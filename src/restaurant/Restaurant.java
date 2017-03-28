package restaurant;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Restaurant {
 
    
    public static void main(String [] args)throws IOException{
        
        Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
        
        initialize(menu);
        Table test = new Table(menu);
        test.AddOrderItem();
        test.DeleteOrderItem();
        test.FinishTable();
    }
    
    public static void initialize(Map<String, MenuItem> menu)throws IOException{
        File inFile = new File("menu.txt");
        Scanner inFileSC = new Scanner(inFile);
        
        while(inFileSC.hasNext()){
            String name = inFileSC.nextLine();
            double price = Double.parseDouble(inFileSC.nextLine());
            int inventory = Integer.parseInt(inFileSC.nextLine());
            loadMenu(name, price, inventory, menu);
        }
    }
    
    public static void loadMenu(String name, double price, int inventory, Map<String, MenuItem> menu){
        
        MenuItem item = new MenuItem(name, price ,inventory);
        menu.put(item.getName(), item);
    }
}
