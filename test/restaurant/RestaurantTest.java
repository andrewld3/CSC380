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
                Restaurant rms = new Restaurant();
                rms.loadMenu("hamburger", 12.5, 50);
                assertEquals("hamburger" , rms.menu.get("hamburger").getName());
                assertEquals(12.5, rms.menu.get("hamburger").getPrice(), 0);
                assertEquals(50, rms.menu.get("hamburger").getInventory());
                
        }
        
        //Testing getting price as well as updating price
        @Test
        public void testPrice(){
                Restaurant rms = new Restaurant();
                rms.loadMenu("hamburger", 12.5, 50);
                assertEquals(12.5, rms.menu.get("hamburger").getPrice(), 0);
                
                rms.menu.get("hamburger").setPrice(13.5);
                assertEquals(13.5, rms.menu.get("hamburger").getPrice(), 0);
                
        }
        
        //Test to make sure updating inventory works as expected (I.E. removing an adding
        @Test
        public void testInventory(){
            Restaurant rms = new Restaurant();
            rms.loadMenu("hamburger", 12.5, 50);
            
            rms.menu.get("hamburger").setInventory(0);
            assertEquals(50, rms.menu.get("hamburger").getInventory());
            
            rms.menu.get("hamburger").setInventory(-1);
            assertEquals(49, rms.menu.get("hamburger").getInventory());
            
            rms.menu.get("hamburger").setInventory(1);
            assertEquals(50, rms.menu.get("hamburger").getInventory());

        }
    
}
