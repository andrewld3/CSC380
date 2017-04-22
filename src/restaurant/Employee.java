package restaurant;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */

public class Employee {
   // public String empID;
    public Table[] tables = new Table[4];
    public String empName;
    private String signIn, signOut;
    
    public boolean admin;
    
    // Start Employee Constructor Methods
    public Employee(String e, boolean priv) {
        empName = e;
        admin = priv;
        for(int i = 0; i <4; i++){
        tables[i] = new Table();
        }
    }
    // End Employee Constructor Methods
    
    // Start Employee Time Tracking Methods
    
    public boolean setSignIn() {
        signIn = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        if(signIn != null)
            return true;
        else
            return false;
    }
    
    public boolean setSignOut() {
        signOut = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        if(signOut != null)
            return true;
        else
            return false;
    }  

    public String returnSignIn() {
        return signIn;
    }
    
    public String returnSignOut() {
        return signOut;
    }
    // End Employee Time Tracking Methods
    
    public boolean orderFood(int table, String name) {
        tables[table].addToOrder(name);
        //System.out.println("ordered " + name);
        RestaurantGUI.menu.get(name).setInventory(-1);
        return true;
    }
    
    public boolean removeFood(int table, String name) {
        tables[table].removeFromOrder(name);
        RestaurantGUI.menu.get(name).setInventory(+1);
        return true;
    }
    
    public boolean finishTable(int table) throws IOException {
        boolean value = false;
        ArrayList<MenuItem> order;
        PrintWriter out = new PrintWriter("receipt.txt");
        //System.out.println(tables[table].getBillInfo(RestaurantGUI.menu));
        order = tables[table].getBillInfo(RestaurantGUI.menu);
       
        //System.out.println("order: " + order);
        //System.out.println("size: " + order.size());
        //Bill
       
        out.println("BILL SUMMARY");
        out.println("-----------------------");
        out.println("Date: "+ signIn.substring(0, 10));
        out.println("Server: " + empName + "\n");
        out.println("Ordered Items:");
        for(int i = 0; i < order.size(); i++) {
            //System.out.println("order: " + order.get(i) + " item name: " + order.get(i).getName() + " price: " + order.get(i).getPrice());
            out.printf("%-20s%.2f", order.get(i).getName(),order.get(i).getPrice());
            out.println();
        }
        out.println();
        out.printf("Subtotal: %.2f", tables[table].getSubtotal(RestaurantGUI.menu));
        out.println();
        out.printf("Tax: %.2f", tables[table].getTax(RestaurantGUI.menu));
        out.println();
        out.printf("Total: %.2f", tables[table].ReturnTotal(RestaurantGUI.menu));
        out.println();
        out.println("Have a nice day!");
        out.close();
        //End Bill
        
        //Clear Table
        tables[table] = null;
        value = true;
        return value;
    }
    
    // End Table Management Methods
}
