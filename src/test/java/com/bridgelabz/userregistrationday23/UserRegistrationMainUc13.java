package com.bridgelabz.userregistrationday23;
import java.util.function.Predicate;

public class UserRegistrationMainUc13 {

    public static void main(String[] args) {
        System.out.println("Firstname :");
        Predicate<String> firstName = i ->i.matches("^[A-Za-z]{3,26}$");
        System.out.println(firstName .test("Saikumar"));

        System.out.println("Lastname :");
        Predicate<String> lastName = i ->i.matches("^[A-Za-z]{3,26}$");
        System.out.println( lastName.test("Gampa"));

        System.out.println("Email :");
        Predicate<String> email = i ->i.matches("abc[.][a-z]{3}@bl[.]co[.][a-z]{2}");
        System.out.println( email.test("xyz.xyz@bl.co.in"));

        System.out.println("MobileNumber :");
        Predicate<String> mobilenumber = i ->i.matches("^(91 )([0-9]{10})$");
        System.out.println( mobilenumber.test("91 9100663540"));

        System.out.println("Password :");
        Predicate<String> password = i ->i.matches("^([aA-zZ]{8,})[0-9]{3}[@$+&*]{1}$");
        System.out.println( password.test("Sai@060200"));
    }
}
