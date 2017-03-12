package restaurant;

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

        private String username;
        private String pin;

        //adding authorized logins will become an administrator function only
        private String[][] authLogins = {{"Randy", "1234"}, {"Gareth", "5678"}, {"Andrew", "0000"}};
        
         
        public AuthorizedUser(String u, String p) {
            username = u;
            pin = p;
        }

        
        //method checks if username and pin match up 
        public boolean IsUserAuthorized() {
            if((username.equals(authLogins[0][0])) && (pin.equals(authLogins[0][1]))) {
                return true;
            } else {
                return false;
            }
        }
}
