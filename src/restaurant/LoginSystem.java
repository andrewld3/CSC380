package restaurant;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author RandyNguyen
 */
public class LoginSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SYSTEM LOGIN FEATURE
        
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
       
        map.put("Randy", "1234");
        map.put("Gareth","4567");
        map.put("Andrew","8910");
        
        
       String name, pin;
        
        System.out.println("Hello. Please enter your username and pin to login.");
        System.out.print("Username: ");
        name = sc.next();
        System.out.print("Pin: ");
        pin = sc.next();

        while (!pin.equals(map.get(name))) {
            System.out.println("");
            System.out.println("You have entered an incorrect login. Please try again.");
            System.out.print("Username: ");
            name = sc.next();
            System.out.print("Pin: ");
            pin = sc.next();

        }
        System.out.println("");
        System.out.println("Welcome!");
    }
    
}
