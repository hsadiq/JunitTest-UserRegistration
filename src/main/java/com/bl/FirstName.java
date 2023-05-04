package com.bl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {

    public boolean getFirstName(String first){

        String firstRegex = "^[A-Z]{1}+[a-z]{3,}";
        Pattern patternobj = Pattern.compile(firstRegex);

        Matcher matchobj = patternobj.matcher(first);

        boolean result = matchobj.matches();

        return result;
    }
}

class LastName {

    public boolean getLastName(String last) {

        String lastRegex = "[A-Z]{1}+[a-z]{3,}";
        Pattern patternobj1 = Pattern.compile(lastRegex);

        Matcher matcher1 = patternobj1.matcher(last);
        boolean result = matcher1.matches();

        return result;
    }
}

class Email {

    public boolean getEmail(String Email){
        String email = "^[a-z]+([.][a-z]+)*@[a-z]+.[a-z]{2,3}([.][a-z]{2,3})*$";
        Pattern patobj = Pattern.compile(email);

        Matcher match2 = patobj.matcher(Email);
        boolean result = match2.matches();

        return result;
    }
}

class PhoneNumber {
    public boolean getMobile(String Number){
        String mobile = "^[0-9]{2,3} +[0-9]{10}";
        Pattern patobj2 = Pattern.compile(mobile);

        Matcher match3 = patobj2.matcher(Number);
        boolean result = match3.matches();

        return result;
    }
}

class Password {
    public boolean getPasswd(String Passwd){
        String password = "^(?=.*[A-Z])(?=.*[a-z][0-9])(?=.*[@#$%^&+=!]).{8,}$";
        Pattern patobj3 = Pattern.compile(password);

        Matcher matcher = patobj3.matcher(Passwd);
        boolean result = matcher.matches();

        return result;
    }
}
