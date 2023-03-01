package com.bridgelabz.userregistrationday23;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;

import org.junit.jupiter.api.Test;



public class UserRegistrationTest {
    UserRegistration ur = new UserRegistration();
    @Test
    public void isValidUserFirstname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Name: " );
        String firstName = sc.next();
        boolean actual = ur.isValidUserFirstname(firstName);
        String expected = firstName;
        assertTrue(actual, expected);
    }
    @Test
    public void isValidUserLastname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last Name: " );
        String lastName = sc.next();
        boolean actual = ur.isValidUserLastname(lastName);
        String expected = lastName;
        assertTrue(actual, expected);
    }
    @Test
    public void isValidUserEmail(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the email: " );
        String email = sc.next();
        boolean actual = ur.isValidEmail(email);
        String expected = email;
        assertTrue(actual, expected);
    }
    @Test
    public void isValidUserMobileFormat(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the mobilenumber: " );
        String mobileNumber = sc1.nextLine();
        boolean actual = ur.isValidMobileFormat(mobileNumber);
        String expected = mobileNumber;
        assertTrue(actual, expected);
    }
    @Test
    public void isValidUserPassword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password: " );
        String password = sc.next();
        boolean actual = ur.isValidPassword(password);
        String expected = password;
        assertTrue(actual, expected);
    }
    
}
