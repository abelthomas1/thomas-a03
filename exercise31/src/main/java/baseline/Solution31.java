/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.*;
import java.lang.*;

public class Solution31 {
    public static void main(String[] args) {

        /*
        prompt the user for age and resting heart rate
        use the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%
        generate a table with the results as shown in the example output
         */

        Scanner sc = new Scanner(System.in);
        float rate;
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            System.out.print("Enter your resting heart rate: ");
            float heart_rate = sc.nextFloat();
            System.out.println("Resting Pulse: " + heart_rate + "      Age: " + age);
            System.out.println("Intensity   | Rate");
            System.out.println("------------|----------");
            for (int i = 55; i <= 95; i += 5) {
                rate = (((220 - age) - heart_rate) * i/100) + heart_rate;
                System.out.println(i + "%" + "         | " + Math.round(rate) + " bpm");
            }
        } catch(Exception e) {
            System.out.println("Sorry, this is an invalid input.");
        }

    }
}
