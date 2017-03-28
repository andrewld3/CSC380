package restaurant;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.junit.Before;

import org.junit.Test;
import static restaurant.Restaurant.loadMenu;
import static restaurant.Restaurant.menu;

public class TableTest {

    public static Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
    
    @Before
    public void CreateMenu() throws IOException{
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
    
    @Test
    public void testAddOrderItem() {
        Table test = new Table(menu);
        Table test2 = new Table(menu);
        test.AddOrderItem();
        test2.AddOrderItem();
    }
    
    @Test
    public void testDeleteOrderItem() {
        
    }
    
    @Test
    public void testCalculateBill() {
        
    }
    
    @Test
    public void testStoreOrder() {
        
    }

    private void assertArrayEquals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
