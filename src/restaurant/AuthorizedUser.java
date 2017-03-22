package restaurant;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RandyNguyen
 */
public class AuthorizedUser {

    String username = "Randy";
    String pin;
    ArrayList<String> authLogins = new ArrayList<>();

    //adding authorized logins will become an administrator function only
    public AuthorizedUser() {
    }

    public void addAuthUser(String u, String p) {
        String login = u + p;
        authLogins.add(login);

    }

    public void printLogins() {
        System.out.println("For testing purposes: ArrayList includes: " + authLogins);

    }

    //method checks if login acccount exists
    public boolean IsUserAuthorized(String u, String p) {

        username = u;
        pin = p;
        String login = u + p;
        int i = 0;
        Boolean found = false;
        while (i < authLogins.size() && found == false) {
            
            System.out.println("Comparison Test: " + login + " and " + authLogins.get(i));
            if (login.equals(authLogins.get(i))) {
                found = true;
                
            } else {

                found = false;
            }
            i++;
        }
        return found;
    }
}

//    public static String[][] getAuthLogins() {
//        return authLogins;
//    }

