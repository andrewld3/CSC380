package restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Andrew
 */


public class Employee {
    public String employeeID;
    private Table[] tables = new Table[1000];
    private String empName;
    private String signIn, signOut;
    private Map<String, MenuItem> menu = new HashMap<>();
    
    public Employee(Map<String, MenuItem> theMenu) {
        menu = theMenu;
    }

    private int ChooseTable() {
        Scanner kbd = new Scanner(System.in);
        int tableNum;
        
        System.out.print("Which table is finished? ");
        tableNum = kbd.nextInt();
        return tableNum;
    }
    public void CreateTable() {
        ChooseTable();
        /* Researching how to add an individual table into the array. ADT List might be the way */
    }

    public void RemoveTable() {
        int table;
        
        table = ChooseTable();
        menu = tables[table].FinishTable();
        tables[table] = null;
    }

    public void OrderFood() {
        
    }
    //Sign In
    public void SignIn() {
        
    }
    //Sign out
    public void SignOut() {
        
    }
    
}
