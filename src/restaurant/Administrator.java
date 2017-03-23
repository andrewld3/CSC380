/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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

    String username;
    String pin;

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
            if (!lineFromUserFile.trim().equals(lineToRemoveFromFile)) {
                if(addNewLine) {
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
            System.out.println(username + "'s account has been removed.");
        }
    }

    public void changePrivilege() {

    }

    public void printUserLogins() throws FileNotFoundException {
        try (Scanner userAccountFolder = new Scanner(new File("userLogin.txt"))) {
            System.out.println("User logins include:");
            while (userAccountFolder.hasNextLine()) {
                String lineFromUserFile = userAccountFolder.nextLine();
                System.out.println(lineFromUserFile);
            }
        }
    }

    public void printAdminLogins() throws FileNotFoundException {
        try (Scanner adminAccountFolder = new Scanner(new File("adminLogin.txt"))) {
            System.out.println("Admin logins include:");
            while (adminAccountFolder.hasNextLine()) {
                String lineFromAdminFile = adminAccountFolder.nextLine();
                System.out.println(lineFromAdminFile);
            }
        }
    }
}
