/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

public class Solution30 {
    public static void main(String[] args) {

        /*
        generate a multiplication table for the numbers 1-12
         */

        for(int i=1;i<=12;i++){
            for(int j=1;j<=12;j++){
                System.out.format("%4d",i*j); // aligns each column
            }
            System.out.println(); // adds a new line at the end
        }
    }
}
