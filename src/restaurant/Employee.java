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
    public int ManageTime(boolean choice) throws IOException {
        boolean signInResult, signOutResult, fileResult;
        int result = 0;
        
        signInResult = false;
        signOutResult = false;
        if (choice == true) {
            signInResult = SignIn();
        } else {
            signOutResult = SignOut();
        }
        
        fileResult = false;
        
        if(signIn != null && signOut !=null) {
            PrintWriter out = new PrintWriter(new FileWriter("EmployeeTimeSheet.txt", true));
            out.println(empID);
            out.println(signIn);
            out.println(signOut);
            out.println();
            out.close();
            fileResult = true;
        }
        
        if(signInResult == true && signOutResult == false && fileResult == false) {
            result = 1;    
        } else if(signInResult == false && signOutResult == true && fileResult == true) {
            result = 2;
        }
        
        return result;
    }
    
    private boolean SignIn() {
        signIn = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        if(signIn != null)
            return true;
        else
            return false;
    }
    
    private boolean SignOut() {
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
    
    public void CreateTable() {
        int i = 0;
        i = ChooseTable();
        tables[i] = new Table();
    } 
    // End Table Management Methods
}
