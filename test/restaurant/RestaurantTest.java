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
                Restaurant rms = new Restaurant();
                rms.loadMenu(menu, "hamburger", 12.5, 50);
                assertEquals("hamburger" , menu.get("hamburger").getName());
                assertEquals(12.5, menu.get("hamburger").getPrice(), 0);
                assertEquals(50, menu.get("hamburger").getInventory());
                
        }
        
        //Testing getting price as well as updating price
        @Test
        public void testPrice(){
                Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
                Restaurant rms = new Restaurant();
                rms.loadMenu(menu, "hamburger", 12.5, 50);
                assertEquals(12.5, menu.get("hamburger").getPrice(), 0);
                
                menu.get("hamburger").setPrice(13.5);
                assertEquals(13.5, menu.get("hamburger").getPrice(), 0);
                
        }
        
        //Test to make sure updating inventory works as expected (I.E. removing an adding
        @Test
        public void testInventory(){
            Map<String, MenuItem> menu = new HashMap<String, MenuItem>();
            Restaurant rms = new Restaurant();
            rms.loadMenu(menu, "hamburger", 12.5, 50);
            
            menu.get("hamburger").setInventory(0);
            assertEquals(50, menu.get("hamburger").getInventory());
            
            menu.get("hamburger").setInventory(-1);
            assertEquals(49, menu.get("hamburger").getInventory());
            
            menu.get("hamburger").setInventory(1);
            assertEquals(50, menu.get("hamburger").getInventory());

        }
    
}
