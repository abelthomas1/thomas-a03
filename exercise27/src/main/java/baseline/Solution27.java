/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27 {

    static String data = "";

    public static void main(String[] args) {

    /*
    prompt the user to enter the first name, last name, employee ID, and ZIP code
    validate the input according the parameters given
    print the appropriate error statements
    */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();

        validateInput(firstName, lastName, zip, employeeID);

    }

    // This method validates all fields

    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {
        /*
        function used to validate the user's inpur
         */

        boolean first = validateFirstName(firstName);
        boolean last = validateLastName(lastName);
        boolean idFlag = validateEmployeeID(employeeID);
        boolean zipFlag = validateZipCode(zip);
        if (first && last && zipFlag && idFlag) {
            data = "There were no errors found.";
        }
        System.out.println(data);
    }

    // This method validates firstName

    public static boolean validateFirstName(String firstName) {
        /*
        make sure the first name is at least two characters long
        make sure it is filled in
         */

        boolean status = true;

        // make sure the length is at least 2 characters

        if (firstName.length() < 2) {
            data = data + "The first name must be at least 2 characters long.\n";
            status = false;
        }
        if (firstName.length() == 0) {
            data = data + "The first name must be filled in.\n";
            status = false;
        }
        return status;
    }

    // This method validates lastName

    public static boolean validateLastName(String lastName) {
        /*
        make sure the last name is at least two characters long
        make sure it is filled in
         */

        boolean status = true;

        // make sure the length is at least two characters

        if (lastName.length() < 2) {
            data = data + "The last name must be at least 2 characters long.\n";
            status = false;
        }
        if (lastName.length() == 0) {
            data = data + "The last name must be filled in.\n";
            status = false;
        }
        return status;

    }

    // This method validates zip

    public static boolean validateZipCode(String zip) {
        /*
        make sure the zip code is a 5 digit number
         */

        boolean status = true;
        try {
            int number = Integer.parseInt(zip);
            if (zip.length() != 5) {
                data = data + "The zipcode must be a 5 digit number.\n";
                status = false;
            }
        } catch (Exception e) {
            data = data + "The zipcode must be a 5 digit number.\n";
            status = false;
        }
        return status;
    }

    // This method validates employeeID

    public static boolean validateEmployeeID(String employeeID) {
        /*
        make sure the employee id follows the format given
         */

        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if (!Pattern.matches(pattern, employeeID)) {
            data = data + "The employee ID must be in the format of AA-1234.\n";
            return false;
        }
        return true;
    }

}