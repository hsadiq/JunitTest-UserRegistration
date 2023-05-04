package com.bl;


import org.junit.jupiter.api.*;


public class UserTest {

    FirstName firstName = new FirstName();
    LastName lastName = new LastName();
    Email email = new Email();
    PhoneNumber phoneNumber = new PhoneNumber();


    @BeforeAll
    static void beforeall(){
        System.out.println("Running Test Cases");
    }

    @BeforeEach
    void beforeEach(){

        System.out.println("Running..........");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Test Cases Running Successfully!");
    }

    @Test
    public void  checking_First(){
        boolean result = firstName.getFirstName("Sadiq");
        Assertions.assertTrue(result);
    }

    @Test
    public void checking_Last(){
        boolean result = lastName.getLastName("Hussain");
        Assertions.assertTrue(result);
    }
    @Test
    public void checkingEmail(){
        boolean result = email.getEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }
    @Test
    public void checkingNumber(){
        boolean result = phoneNumber.getMobile("91 7828606108");
        Assertions.assertTrue(result);
    }
}
