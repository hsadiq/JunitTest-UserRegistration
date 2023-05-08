package com.bl;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EmailValidationTest {

    @BeforeAll
    static void beforeALl(){
        System.out.println("Testing Cases For Emails");
    }

    @BeforeEach
    void before(){
        System.out.println("Test Running.........");
    }

//Adding Sample Emails For Both Cases
    @Test
    public void testValidEmails() {
        ArrayList<String> email = new ArrayList<>();
        // add valid email addresses to the list
        email.add("abc@yahoo.com");
        email.add("abc-100@yahoo.com");
        email.add("abc.100@yahoo.com");
        email.add("abc111@abc.com");
        email.add("abc-100@abc.net");
        email.add("abc.100@abc.com.au");
        email.add("abc@1.com");
        email.add("abc@gmail.com.com");
        email.add("abc+100@gmail.com");

        String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";

        Pattern pattern = Pattern.compile(reGex);

        for (String emailAddress : email) {
            Matcher matcher = pattern.matcher(emailAddress);
            assertTrue(emailAddress + " should be a valid email address", matcher.matches());
        }
    }

    @Test
    public void testInvalidEmails() {
        ArrayList<String> email = new ArrayList<>();
        // add invalid email addresses to the list
        email.add("abc");
        email.add("abc..");
        email.add("abc..@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@.com.my");
        email.add("abc123@gmail.a");
        email.add("abc123@.com");
        email.add("abc123@.com.com");
        email.add(".abc@abc.com");
        email.add("abc()*@gmail.com");
        email.add("abc..2002@gmail.com");
        email.add("abc.@gmail.com");
        email.add("abc@abc@gmail.com");
        email.add("abc@gmail.com.1a");
        email.add("abc..@gmail.com");
        email.add("abc@gmail.com.aa.au");

        String reGex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:([0-9]{1}|[a-zA-Z]{3,5})\\.)+[a-zA-Z]{2,3}";

        Pattern pattern = Pattern.compile(reGex);

        for (String emailAddress : email) {
            Matcher matcher = pattern.matcher(emailAddress);
            assertFalse(emailAddress + " should be an invalid email address", matcher.matches());
        }
    }


    @AfterAll
    static void afterAll(){
        System.out.println("Emails Are Passed All Test Cases Successfully");
    }

    @AfterEach
    void afterEach(){
        System.out.println("Test Is Success!");
    }

}

