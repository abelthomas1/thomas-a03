/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution25 {
    public static int passwordValidator(String input) {
        
        /*
        using the parameters given, determine the strength of the password
        */

        int n = input.length();
        int result;
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
                Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                        '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }

        if (hasDigit && (hasLower || hasUpper) && specialChar
                && (n >= 8))
            result = 1;
        else if ((hasLower || hasUpper || specialChar)
                && (n >= 8))
            result = 2;
        else if((hasLower || hasUpper) && (n < 8))
            result = 3;
        else
            result = 4;
        return result;
    }

    public static void main(String[] args)
    {
        /*
        prompt user to input the password
        use a function to determine the strength
        print the strength of the password
        */

        String input;
        String result;
        int check;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter password: ");
        input = sc.nextLine();

        check = passwordValidator(input);

        if (check == 1){
            result = "very strong";
        }
        else if (check == 2){
            result = "strong";
        }
        else if (check == 3){
            result = "weak";
        }
        else {
            result = "very weak";
        }

        System.out.println("The password '" + input + "' is a " + result + " password.");
    }
}

