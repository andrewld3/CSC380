/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resteraunt;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gareth
 */
public class ResterauntTest {
    
    public ResterauntTest() {
    }
        
        //Test to see if value is laoded into hamburger slot match the actual values
        @Test
        public void testLoadMenu() {
                Resteraunt rms = new Resteraunt();
                rms.loadMenu("hamburger", 12.5, 50);
                assertEquals("hamburger" , rms.menu.get("hamburger").getName());
                assertEquals(12.5, rms.menu.get("hamburger").getPrice(), 0);
                assertEquals(50, rms.menu.get("hamburger").getInventory());
                
        }
        
        //Testing getting price as well as updating price
        @Test
        public void testPrice(){
                Resteraunt rms = new Resteraunt();
                rms.loadMenu("hamburger", 12.5, 50);
                assertEquals(12.5, rms.menu.get("hamburger").getPrice(), 0);
                
                rms.menu.get("hamburger").setPrice(13.5);
                assertEquals(13.5, rms.menu.get("hamburger").getPrice(), 0);
                
        }
        
        //Test to make sure updating inventory works as expected (I.E. removing an adding
        @Test
        public void testInventory(){
            Resteraunt rms = new Resteraunt();
            rms.loadMenu("hamburger", 12.5, 50);
            
            rms.menu.get("hamburger").setInventory(0);
            assertEquals(50, rms.menu.get("hamburger").getInventory());
            
            rms.menu.get("hamburger").setInventory(-1);
            assertEquals(49, rms.menu.get("hamburger").getInventory());
            
            rms.menu.get("hamburger").setInventory(1);
            assertEquals(50, rms.menu.get("hamburger").getInventory());

        }
    
}
