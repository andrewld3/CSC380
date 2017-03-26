package restaurant;

import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Restaurant {

    public static Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
    
    public static void main(String [] args)throws IOException{
        initialize();
        Table table = new Table(menu);
        table.AddOrderItem();
    }
    
    public static void initialize()throws IOException{
        File inFile = new File("menu.txt");
        Scanner inFileSC = new Scanner(inFile);
        
        while(inFileSC.hasNext()){
            String name = inFileSC.nextLine();
            double price = Double.parseDouble(inFileSC.nextLine());
            int inventory = Integer.parseInt(inFileSC.nextLine());
            loadMenu(name, price, inventory);
        }
    }
    
    public static void loadMenu(String name, double price, int inventory){
        
        MenuItem item = new MenuItem(name, price ,inventory);
        menu.put(item.getName(), item);
    }
}
