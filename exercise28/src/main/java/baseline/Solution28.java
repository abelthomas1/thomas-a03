/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.Scanner;

public class Solution28 {
    public static void main(String[] args) {

        /*
        prompt the user to enter 5 numbers
        find the sum of the numbers
        print the total
         */

        Scanner in = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            total += in.nextInt();
        }
        System.out.println("The total is " + total + ".");
    }
}
