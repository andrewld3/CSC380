package restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    public Login() throws FileNotFoundException, IOException {

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

                    Administrator adm = new Administrator();
                    String input = "";
                    while (!input.equals("exit")) {
                        System.out.println("Administrator functions: a for (Add user), b for (Delete user), c for (Change privilege), or exit to close Administrator functions.");
                        input = scanner.nextLine();
                        switch (input) {
                            case "a":
                                System.out.println("Username?");
                                String username = scanner.nextLine();
                                System.out.println("Pin?");
                                String pin = scanner.nextLine();
                                adm.addUser(username, pin);
                                break;
                            case "b":
                                System.out.println("Username to delete?");
                                String usernameRemove = scanner.nextLine();
                                System.out.println("Pin?");
                                String pinRemove = scanner.nextLine();
                                adm.deleteUser(usernameRemove, pinRemove);
                                break;
                            case "c":
                                System.out.println("Privilege change: a for USER->ADMIN, b for ADMIN->USER, or c for cancel.");
                                String priv = scanner.nextLine();
                                if (priv.equals("a")) {
                                    System.out.println("You are about to change the privileges of a User to an Administrator.");
                                    System.out.println("What is the account's username?");
                                    String usernameToSwitch = scanner.nextLine();
                                    System.out.println("What is the account's pin?");
                                    String pinToSwitch = scanner.nextLine();
                                    adm.changePrivilegeFromUserToAdmin(usernameToSwitch, pinToSwitch);
                                } else if (priv.equals("b")) {
                                    System.out.println("You are about to change the privileges of an Administrator to a User.");
                                    System.out.println("What is the account's username?");
                                    String usernameToSwitch = scanner.nextLine();
                                    System.out.println("What is the account's pin?");
                                    String pinToSwitch = scanner.nextLine();
                                    adm.changePrivilegeFromAdminToUser(usernameToSwitch, pinToSwitch);
                                }   break;
                            case "close":
                                break;
                            default:
                                break;
                        }
                    }
                } else {
                    System.out.println(UsernameTextField + " has been logged in as an authorized user.");
                }
            }
        }
    }
}
