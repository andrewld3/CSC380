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
        AuthorizedUser au = new AuthorizedUser();
        au.addAuthUser("Randy", "1234");
        au.addAuthUser("Gareth", "4567");
        au.addAuthUser("Andrew", "7890");

        String username = "Randy";
        String pin = "1234";

        assertTrue(au.IsUserAuthorized(username, pin));
    }

    //tests that an incorrect username will return false
    @Test
    public void testIsUserAuthorizedFail() {
        AuthorizedUser au = new AuthorizedUser();
        au.addAuthUser("Randy", "1234");
        au.addAuthUser("Gareth", "4567");
        au.addAuthUser("Andrew", "7890");

        String username = "Randeee";
        String pin = "1234";

        assertFalse(au.IsUserAuthorized(username, pin));
    }

    //tests that an incorrect pin will return false 
    @Test
    public void testIsUserAuthorizedFail2() {
        AuthorizedUser au = new AuthorizedUser();
        au.addAuthUser("Randy", "1234");
        au.addAuthUser("Gareth", "4567");
        au.addAuthUser("Andrew", "7890");

        String username = "Randy";
        String pin = "1111";

        assertFalse(au.IsUserAuthorized(username, pin));
    }

}
