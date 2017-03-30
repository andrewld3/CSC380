package restaurant;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
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
    public Employee(Map<String, MenuItem> theMenu) {
        menu = theMenu;
    }
    // End Employee Constructor Methods
    
    // Start Employee Time Tracking Methods
    
    public boolean SetSignIn() {
        signIn = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        if(signIn != null)
            return true;
        else
            return false;
    }
    
    public boolean SetSignOut() {
        signOut = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        if(signIn != null)
            return true;
        else
            return false;
    }  

    // End Employee Time Tracking Methods
    
    // Start Table Management Methods
    private int ChooseTable() {
        Scanner kbd = new Scanner(System.in);
        int tableNum;
        
        System.out.print("Which table? ");
        tableNum = kbd.nextInt();
        return tableNum;
    }
    
    public boolean CreateTable() {
        int i = 0;
        i = ChooseTable();
        tables[i] = new Table();
        if(tables[i] != null)
            return true;
        else 
            return false;
    }
    
    public boolean OrderFood() {
        return true;
    }
    
    
    // End Table Management Methods
}
