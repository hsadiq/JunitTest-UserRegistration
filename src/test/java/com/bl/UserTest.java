package com.bl;


import org.junit.jupiter.api.*;


public class UserTest {

    FirstName firstName = new FirstName();


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
        FirstName lastName = new FirstName();
        boolean result = lastName.getLastName("Hussain");
        Assertions.assertTrue(result);
    }
}
