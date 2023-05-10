package com.bl;
import java.util.function.Predicate;

public class UserValidator {

    private final Predicate<String> validateFirstName = firstName -> firstName.matches("^[A-Z]{1}+[a-z]{3,}");
    private final Predicate<String> validateLastName = lastName -> lastName.matches("[A-Z]{1}+[a-z]{3,}");
    private final Predicate<String> validateEmail = email -> email.matches("^[a-z]+([.][a-z]+)*@[a-z]+.[a-z]{2,3}([.][a-z]{2,3})*$");
    private final Predicate<String> validateMobile = mobile -> mobile.matches("^[0-9]{2,3} +[0-9]{10}");
    private final Predicate<String> validatePassword = password -> password.matches("^(?=.*[A-Z])(?=.*[a-z][0-9])(?=.*[@#$%^&+=!]).{8,}$");

    public boolean validateInput(String input, Predicate<String> validator) {
        return validator.test(input);
    }

    public boolean validateFirstName(String firstName) {
        return validateInput(firstName, validateFirstName);
    }

    public boolean validateLastName(String lastName) {
        return validateInput(lastName, validateLastName);
    }

    public boolean validateEmail(String email) {
        return validateInput(email, validateEmail);
    }

    public boolean validateMobile(String mobile) {
        return validateInput(mobile, validateMobile);
    }

    public boolean validatePassword(String password) {
        return validateInput(password, validatePassword);
    }

    public static void main(String[] args) {
        UserValidator validator = new UserValidator();


        validator.validateFirstName("Sadiq");
        validator.validateLastName("Hussain");
        validator.validateMobile("91 7828606108");
        validator.validateEmail("abc.xyz@bl.co.in");
        validator.validatePassword("Sadiq123@");
    }
}