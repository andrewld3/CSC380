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
    public String empID;
    private Table[] tables = new Table[1000];
    private String empName;
    private String signIn, signOut;
    private Map<String, MenuItem> menu = new HashMap<>();
    
    // Start Employee Constructor Methods
    public Employee() {
        
    }
    // End Employee Constructor Methods
    
    //Load Menu
    public boolean loadMenu(Map<String, MenuItem> theMenu) {
        boolean value = false;
        if(theMenu != null) {
            menu = theMenu;
            value = true;
        } else {
            value = false;
        }
        return value;
    }
    
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
    
    // Start Table Management Methods
    public boolean createTable(int table) {
        boolean value = false;
        tables[table] = new Table();
        if (tables[table] != null)
            value = true;
        else
            value = false;
        return value;
    }
    
    public boolean orderFood(int table, String name) {
        tables[table].addToOrder(name);
        return true;
    }
    
    public boolean removeFood(int table, String name) {
        tables[table].removeFromOrder(name);
        return true;
    }
    
    public boolean finishTable(int table) throws IOException {
        boolean value = false;
        ArrayList<MenuItem> order;
        PrintWriter out = new PrintWriter("receipt.txt");
        order = tables[table].getBillInfo(menu);
        
        //Bill
        out.println("BILL SUMMARY");
        out.println();
        out.println("Ordered Items");
        for(int i = 0; i < order.size(); i++) {
            out.println(order.get(i).getName() + "     " + order.get(i).getPrice());
        }
        out.println();
        out.println("Subtotal: " + tables[table].getSubtotal(menu));
        out.println("Tax: " + tables[table].getTax(menu));
        out.println("Total: " + tables[table].ReturnTotal(menu));
        out.close();
        //End Bill
        
        //Clear Table
        tables[table] = null;
        value = true;
        return value;
    }
    
    // End Table Management Methods
}
