package com.bridgelabz.userregistrationday23;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class UserRegistrationTestUc12 {
    UserRegistrationUc12 ur = new UserRegistrationUc12();
    @Test
    public void isValidUserFirstname() throws InvalidUserException{
        try {
            boolean actual = ur.isValidUserFirstname("Sange@tha");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.FIRSTNAME,e.type);
        }
    }
    @Test
    public void isValidUserLastname(){
        try {
            boolean actual = ur.isValidUserLastname("posam2");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.LASTNAME,e.type);
        }
    }
    @Test
    public void isValidUserEmail(){
        try {
            boolean actual = ur.isValidEmail(".abc@gmail.com");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.EMAIL,e.type);
        }
    }
    @Test
    public void isValidUserMobileFormat(){
        try {
            boolean actual = ur.isValidMobileFormat("89796574885");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.MOBILENUMBER,e.type);
        }
    }
    @Test
    public void isValidUserPassword(){
        try {
            boolean actual = ur.isValidPassword("@san2564");
        }catch(InvalidUserException e) {
            assertEquals(InvalidUserException.enumType.PASSWORD,e.type);
        }
    }
}
