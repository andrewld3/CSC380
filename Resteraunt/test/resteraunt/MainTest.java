/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.util.HashMap;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RandyNguyen
 */
public class MainTest {

    /**
     * Test of main method, of class Main.
     */
    
    //Test to verify login details are being added 
    @Test
    public void testUserAdd() {
        HashMap<String, String> map = new HashMap<>();

        map.put("Randy", "1234");
        map.put("Gareth", "4567");
        map.put("Andrew", "8910");
        assertEquals(3, map.size());

    }
    
    //Test that correct login passes
    @Test
    public void testLoginPass() {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("Randy", "1234");
        map.put("Gareth", "4567");
        map.put("Andrew", "8910");

        //For testing purposes user has entered "Randy" for username and "1234" for pin
        String name = "Randy", pin = "1234";
        assertEquals(pin, map.get(name));
    }

    //Test false login
    @Test
    public void testLoginFail() {
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("Randy", "1234");
        map.put("Gareth", "4567");
        map.put("Andrew", "8910");

        //For testing purposes user has entered "Randy" for username and "1111" for pin
        String name = "Randy", pin = "1111";
        assertNotEquals(pin, map.get(name));
    }
}
