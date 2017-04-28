package restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author RandyNguyen
 */
public class Login {

    //Table table1 = new Table();
    private boolean isLoggedIn = false;
    boolean isAdmin = false;
    Employee emp;

    public Login() throws FileNotFoundException, IOException {
    }

    public Employee signIn(String u, String p) throws FileNotFoundException, IOException {
        boolean isLoggedIn = false;
        boolean isAdmin = false;
   
            String UsernameTextField = u;
            String PinTextField = p;
            

            //System.out.println(PinTextField);
            String login = UsernameTextField + PinTextField;
            //System.out.println(login);

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
                //System.out.println("(POPUP) You have entered an incorrect login. Please try again. Note: Login is case sensitive.");
                emp = null;

                } else if(isLoggedIn == true){
                    //System.out.println(UsernameTextField + " has been logged in as an authorized user.");
                    String employeeName = UsernameTextField;
                    emp = new Employee(employeeName, isAdmin);

                }

         return emp;
       
    }
}


