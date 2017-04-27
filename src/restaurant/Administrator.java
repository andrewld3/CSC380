package restaurant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RandyNguyen
 */
public class Administrator {
   
    
    FileWriter fileWriter = null;
    PrintWriter printWriter = null;
    BufferedReader buffReader = null;
    BufferedWriter buffWriter = null;

    private String username;
    private String pin;

    //add user to list
    //set priveleges to selected value
    //delete 
    //change privelages
    public Administrator() {
    }

    public void addUser(String u, String p) throws IOException {
        username = u;
        pin = p;

        FileWriter fileWriter = new FileWriter("userLogin.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("\n" + username + pin);
        printWriter.close();
        fileWriter.close();
        System.out.println(username + "'s account has been added to User Accounts.");
    }

    public void deleteUser(String u, String p) throws IOException {

        username = u;
        pin = p;

        File userAccountFolder = new File("userLogin.txt");
        File temporaryFile = new File("temporaryFile.txt");

        BufferedReader buffReader = new BufferedReader(new FileReader(userAccountFolder));
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(temporaryFile));

        String lineToRemoveFromFile = username + pin;
        String lineFromUserFile;

        boolean addNewLine = false;

        while ((lineFromUserFile = buffReader.readLine()) != null) {
            if (!lineFromUserFile.equals(lineToRemoveFromFile)) {
                if (addNewLine) {
                    buffWriter.newLine();
                }
                addNewLine = true;
                buffWriter.write(lineFromUserFile);
            }
        }
        buffWriter.close();
        buffReader.close();

        boolean removed = temporaryFile.renameTo(userAccountFolder);
        if (removed == true) {
            System.out.println(username + "'s account has been removed from User Accounts.");
        }
    }

    public void changePrivilegeFromUserToAdmin(String u, String p) throws IOException {
        username = u;
        pin = p;

        Administrator adm = new Administrator();
        adm.deleteUser(username, pin);

        FileWriter fileWriter = new FileWriter("adminLogin.txt", true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("\n" + username + pin);
        printWriter.close();
        fileWriter.close();
        System.out.println(username + "'s privileges have been changed to Administrator.");
    }

    public void changePrivilegeFromAdminToUser(String u, String p) throws IOException {
        //First part of code deletes user from adminLogin.txt
        username = u;
        pin = p;

        File userAccountFolder = new File("adminLogin.txt");
        File temporaryFile = new File("temporaryFile.txt");

        BufferedReader buffReader = new BufferedReader(new FileReader(userAccountFolder));
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter(temporaryFile));

        String lineToRemoveFromFile = username + pin;
        String lineFromUserFile;

        boolean addNewLine = false;

        while ((lineFromUserFile = buffReader.readLine()) != null) {
            if (!lineFromUserFile.equals(lineToRemoveFromFile)) {
                if (addNewLine) {
                    buffWriter.newLine();
                }
                addNewLine = true;
                buffWriter.write(lineFromUserFile);
            }
        }
        buffWriter.close();
        buffReader.close();

        boolean removed = temporaryFile.renameTo(userAccountFolder);
        if (removed == true) {
            //adds former admin to user account
           Administrator adm = new Administrator();
           adm.addUser(username, pin);
            System.out.println(username + "'s privileges have been changed to user.");
        }
    }

    public ArrayList printUserLogins() throws FileNotFoundException {
        ArrayList<String> userLogins = new ArrayList<String>(); 
        try (Scanner userAccountFolder = new Scanner(new File("userLogin.txt"))) {
            //System.out.println("User logins include:");
            while (userAccountFolder.hasNextLine()) {
                String lineFromUserFile = userAccountFolder.nextLine();
                //System.out.println(lineFromUserFile);
                userLogins.add(lineFromUserFile);
            }
        }
        return userLogins;
    }

    public ArrayList printAdminLogins() throws FileNotFoundException {
        ArrayList<String> adminLogins = new ArrayList<String>();
        try (Scanner adminAccountFolder = new Scanner(new File("adminLogin.txt"))) {
           // System.out.println("Admin logins include:");
            while (adminAccountFolder.hasNextLine()) {
                String lineFromAdminFile = adminAccountFolder.nextLine();
                //System.out.println(lineFromAdminFile);
                adminLogins.add(lineFromAdminFile);
            }
        }
        return adminLogins;
    }

    
    public void deleteFromMenu(String name){
     RestaurantGUI.menu.remove(name);
      System.out.println(name + " has been removed from the menu.");
        System.out.println("Updated Menu size: " + RestaurantGUI.menu.size());
    }
    
    public void addToMenu(String name, double price, int inventory) {
        MenuItem newItem = new MenuItem(name, price, inventory);
        System.out.println("Menu size: " + RestaurantGUI.menu.size());
        RestaurantGUI.menu.put(name, newItem);
        System.out.println("Updated Menu size: " + RestaurantGUI.menu.size());
    }
}
