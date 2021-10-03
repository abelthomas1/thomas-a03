/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    static boolean isAnagram(String string1, String string2) {
        /*
        sort the two strings and determine if they are anagrams of each other
         */

        //if the length is not the same, the two strings cannot be anagrams

        if (string1.length() != string2.length()) {
            return false;
        }

        //place the letters in each string in an array

        char[] a1 = string1.toCharArray();
        char[] a2 = string2.toCharArray();

        //sort the array

        Arrays.sort(a1);
        Arrays.sort(a2);

        //if the two strings are anagrams, the sorted arrays will be the same

        return Arrays.equals(a1, a2);
    }


    public static void main(String[] args) {
        /*
        prompt user input for two strings
        determine if the strings are anagrams of each other
        print the result
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String string1 = input.next();
        System.out.print("Enter the second string: ");
        String string2 = input.next();

        boolean result = isAnagram(string1, string2);

        if (result){
            System.out.print('"' + string1 + '"' + " and " + '"' + string2 + '"' + " are anagrams.");
        }
        else {
            System.out.print('"' + string1 + '"' + " and " + '"' + string2 + '"' + " are not anagrams.");
        }

    }
}
