package com.bl;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    public void  checking_First(){
        UserValidator firstName = new UserValidator();
        boolean result = firstName.validateFirstName("Sadiq");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Last(){
        UserValidator lastName = new UserValidator();
        boolean result = lastName.validateLastName("Hussain");
        Assertions.assertTrue(result);
    }


    @Test
    public  void  checking_Email(){
        UserValidator email = new UserValidator();
        boolean result = email.validateEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_PhoneNum(){
        UserValidator mobile = new UserValidator();
        boolean result = mobile.validateMobile("91 7828606108");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Password(){
        UserValidator passwd = new UserValidator();
        boolean result = passwd.validatePassword("Sadiq123@");
        Assertions.assertTrue(result);
    }

    @Test
    public void  checking_WFirst(){
        UserValidator firstName = new UserValidator();
        boolean result = firstName.validateFirstName("sadique");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_WLast(){
        UserValidator lastName = new UserValidator();
        boolean result = lastName.validateLastName("hussain");
        Assertions.assertTrue(result);
    }


    @Test
    public  void  checking_WEmail(){
        UserValidator email = new UserValidator();
        boolean result = email.validateEmail("abc.xyz@bl.com.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_WPhoneNum(){
        UserValidator mobile = new UserValidator();
        boolean result = mobile.validateMobile("9107828606108");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_WPassword(){
        UserValidator passwd = new UserValidator();
        boolean result = passwd.validatePassword("Sadiq@123");
        Assertions.assertTrue(result);
    }
}
