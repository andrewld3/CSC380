/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RandyNguyen
 */
public class AuthorizedUserTest {
   
    //tests that a correct login will return true
    @Test
    public void testIsUserAuthorized() {
          AuthorizedUser au = new AuthorizedUser("Randy", "1234");
          assertEquals(true, au.IsUserAuthorized());
    }
    
    //tests that an incorrect username will return false
    @Test
    public void testIsUserAuthorizedFail(){
        AuthorizedUser au = new AuthorizedUser("Randeee", "1234");
        assertEquals(false, au.IsUserAuthorized());
    }
    
    //tests that an incorrect pin will return false 
   @Test
    public void testIsUserAuthorizedFail2(){
        AuthorizedUser au = new AuthorizedUser("Randy", "1111");
        assertEquals(false, au.IsUserAuthorized());
    }
    
    
}
