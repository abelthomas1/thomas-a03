/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.Scanner;

public class Solution29 {
    public static void main(String[] args) {

        /*
        prompt the user for the rate of return
        if the user enters 0, or a non number, print an error message and try again
        use the formula to find the number of years required to double the investment
        print the result
         */

        Scanner inp = new Scanner(System.in);
        int num = 0;
        String input = "";
        String exit = "exit";
        boolean isStringNumber = true;

        while(true){

            System.out.println("What is the rate of return? ");
            input = inp.next();

            if(input.equalsIgnoreCase(exit)){break;}

            isStringNumber = input.matches("[1-9]+");

            if(!isStringNumber){
                System.out.println("Sorry. That's not a valid input.");
            }else{
                num = Integer.parseInt(input);

                int years = 72 / num;

                System.out.println("It will take " + years + " years to double your initial investment.");
                break;
            }

        }

    }
}

