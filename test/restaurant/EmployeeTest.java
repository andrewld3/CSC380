package restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
   
    @Test
    public void testEmployeeConstruct() {
        Employee test = new Employee("Chris N", false);
        test = null;
        assertTrue(test == null);
    }
    
    @Test
    public void testSignIn() {
        Employee test = new Employee("Chris N", false);
        boolean result;
        result = test.setSignIn();
        if(result)
            assertTrue(true);
        else
            fail("Sign in Failed");
    }
    
    @Test
    public void testSignOut() {
        Employee test = new Employee("Chris N", false);
        boolean result;
        result = test.setSignOut();
        if(result)
            assertTrue(true);
        else
            fail("Sign out Failed");
    }
    
    @Test
    public void testOrderFood() throws IOException{
        boolean value;
        Employee testEmployee = new Employee("Chris N", false);
        value = testEmployee.orderFood(1, "hamburger");
        if(value == true)
            assertTrue(true);
        
    }
    
    @Test
    public void testRemoveFood() throws IOException {
        boolean value;
        Employee testEmployee = new Employee("Chris N", false);
        testEmployee.orderFood(1, "hamburger");
        value = testEmployee.removeFood(1, "hamburger");
        if(value == true)
            assertTrue(true);
    }
    
    @Test
    public void testFinishFood() throws IOException {
        boolean value;
        Employee testEmployee = new Employee("Chris N", false);
        value = testEmployee.orderFood(1, "hamburger");
        value = testEmployee.finishTable(1);
    }
}
