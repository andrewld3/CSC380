package restaurant;

import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TableTest {
    
    @Before
    public void initializeTest() {
        Restaurant test = new Restaurant();
        Map<String, MenuItem> testMenu = new HashMap<>();
        testMenu = test.menu;
    }
    
    @Test
    public void testAddOrderItem() {
        
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
}
