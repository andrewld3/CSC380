package restaurant;

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
    public Employee() {
        System.out.println("Warning: Menu not loaded");
    }
    public Employee(Map<String, MenuItem> theMenu) {
        menu = theMenu;
    }
    
    public void GetMenu(Map<String, MenuItem> theMenu) {
        menu = theMenu;
    }
    // End Employee Constructor Methods
    
    // Start Employee Time Tracking Methods
    public void SignIn() {
        signIn = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }
    
    public void SignOut() {
        signOut = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
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
    
    public void CreateTable() {
        int i = 0;
        i = ChooseTable();
        tables[i] = new Table();
    } 
    // End Table Management Methods
}
