package restaurant;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gareth
 */
public class RestaurantTest {
    
    public RestaurantTest() {
    }
        
        //Test to see if value is laoded into hamburger slot match the actual values
        @Test
        public void testLoadMenu() {
                Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
                menu.put("Hamburger", new MenuItem("Hamburger", 10.50, 50));
                menu.put("Hotdog", new MenuItem("Hotdog", 3.50, 50));
                
                assertEquals("Hamburger" , menu.get("Hamburger").getName());
                assertEquals(10.5, menu.get("Hamburger").getPrice(), 0);
                assertEquals(50, menu.get("Hamburger").getInventory());
                
        }
        
        //Testing getting price as well as updating price
        @Test
        public void testPrice(){
                Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
                menu.put("Hamburger", new MenuItem("Hamburger", 10.50, 50));
                menu.put("Hotdog", new MenuItem("Hotdog", 3.50, 50));
                
                assertEquals(10.5, menu.get("Hamburger").getPrice(), 0);
                
                menu.get("Hamburger").setPrice(13.5);
                assertEquals(13.5, menu.get("Hamburger").getPrice(), 0);
                
        }
        
        //Test to make sure updating inventory works as expected (I.E. removing an adding
        @Test
        public void testInventory(){
            Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
            menu.put("Hamburger", new MenuItem("Hamburger", 10.50, 50));
            menu.put("Hotdog", new MenuItem("Hotdog", 3.50, 50));
            
            menu.get("Hamburger").setInventory(0);
            assertEquals(50, menu.get("Hamburger").getInventory());
            
            menu.get("Hamburger").setInventory(-1);
            assertEquals(49, menu.get("Hamburger").getInventory());
            
            menu.get("Hamburger").setInventory(1);
            assertEquals(50, menu.get("Hamburger").getInventory());

        }
    
}
