package restaurant;

import java.io.IOException;
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
    private double signIn, signOut;
    private Map<String, MenuItem> menu = new HashMap<>();
    
    public Employee(Map<String, MenuItem> theMenu) {
        menu = theMenu;
    }

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
        tables[i] = new Table(menu);
        
        
    }

    public Map<String, MenuItem> RemoveTable() throws IOException{
        int i;
        
        i = ChooseTable();
        menu = tables[i].FinishTable();
        tables[i] = null;
        return menu;
    }

    public void OrderFood() {
        int i;
        i = ChooseTable();
        tables[i].AddOrderItem();
    }
   
    public void SignIn() {
        signIn = System.currentTimeMillis();
    }
    
    public void SignOut() {
        signOut = System.currentTimeMillis();
    }   
}
