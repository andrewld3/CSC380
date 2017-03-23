package restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RandyNguyen
 */
public class Login {

    public Login() throws FileNotFoundException {

        boolean isLoggedIn = false;
        boolean isAdmin = false;

        while (isLoggedIn == false) {
            System.out.print("Username: ");
            Scanner scanner = new Scanner(System.in);
            String UsernameTextField = scanner.nextLine();
            System.out.print("Pin: ");
            String PinTextField = scanner.nextLine();

            String login = UsernameTextField + PinTextField;

            Scanner userAccountFolder = new Scanner(new File("userLogin.txt"));
            Scanner adminAccountFolder = new Scanner(new File("adminLogin.txt"));

            while (userAccountFolder.hasNext() && isLoggedIn == false) {
                String lineFromUserFile = userAccountFolder.nextLine();
                if (lineFromUserFile.compareTo(login) == 0) {
                    isLoggedIn = true;
                }
            }
            userAccountFolder.close();
            while (adminAccountFolder.hasNext() && isLoggedIn == false) {
                String lineFromAdminFile = adminAccountFolder.nextLine();
                if (lineFromAdminFile.compareTo(login) == 0) {
                    isLoggedIn = true;
                    isAdmin = true;
                }
            }
            adminAccountFolder.close();

            if (isLoggedIn == false) {
                System.out.println("(POPUP) You have entered an incorrect login. Please try again. Note: Login is case sensitive.");
            } else {
                if (isAdmin == true) {
                    System.out.println(UsernameTextField + " has been logged in as an administrator.");
                } else {
                    System.out.println(UsernameTextField + " has been logged in as an authorized user.");
                }
            }
        }
    }
}
