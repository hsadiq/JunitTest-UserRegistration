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

    public boolean getLastName(String last) {

        String lastRegex = "[A-Z]{1}+[a-z]{3,}";
        Pattern patternobj1 = Pattern.compile(lastRegex);

        Matcher matcher1 = patternobj1.matcher(last);
        boolean result = matcher1.matches();

        return result;
    }
}
