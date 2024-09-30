/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logintest;

/**
 *
 * @author RC_Student_lab
 */
import org.junit.Test;

public class LoginTest {

    @Test
    public void testCheckUserName() {
        Login login = new Login("john_d", "Password1!", "John", "Doe");
        assertTrue(login.checkUserName());
    }

    @Test
    public void testCheckPasswordComplexity() {
        Login login = new Login("john_d", "Password1!", "John", "Doe");
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testRegisterUserSuccess() {
        Login login = new Login("john_d", "Password1!", "John", "Doe");
        assertEquals("Username and password successfully captured", login.registerUser());
    }

    @Test
    public void testLoginSuccess() {
        Login login = new Login("john_d", "Password1!", "John", "Doe");
        assertTrue(login.loginUser("john_d", "Password1!"));
    }
}
