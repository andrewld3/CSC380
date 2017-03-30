package restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Andrew
 */

public class EmployeeTest {
    Map<String, MenuItem> menu = new HashMap<>();
    
    public EmployeeTest() {
        
    }
    
    @Before
    public void setUp() throws FileNotFoundException {
        File inFile = new File("menu.txt");
        Scanner inFileSC = new Scanner(inFile);
        
        while(inFileSC.hasNext()){
            String name = inFileSC.nextLine();
            double price = Double.parseDouble(inFileSC.nextLine());
            int inventory = Integer.parseInt(inFileSC.nextLine());
            MenuItem item = new MenuItem(name, price ,inventory);
            menu.put(item.getName(), item);
        }
    }
   
    @Test
    public void testEmployeeConstruct() {
        Employee test = new Employee(menu);
        test = null;
        assertTrue(test == null);
    }
    
    @Test
    public void testSignIn() {
        Employee test = new Employee(menu);
        boolean result;
        result = test.SetSignIn();
        if(result)
            assertTrue(true);
        else
            fail("Sign in Failed");
    }
    
    @Test
    public void testSignOut() {
        Employee test = new Employee(menu);
        boolean result;
        result = test.SetSignOut();
        if(result)
            assertTrue(true);
        else
            fail("Sign out Failed");
    }
    
    @Test
    public void testFileStorage() {
        
    }
}
