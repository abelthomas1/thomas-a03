/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.*;

public class Solution33 {
    public static void main(String[] args) {

        /*
        prompt the user to enter a question
        display either "Yes," "No," "Maybe," or "Ask again later"
         */

        String[] responses = new String[]{"Yes", "No", "Maybe", "Ask again later"};

        Scanner sc = new Scanner(System.in);
        String que;

        System.out.print("What's your question?\n > ");
        que = sc.nextLine();

        System.out.println();


        Random rand = new Random();
        int v = rand.nextInt(4);

        System.out.println(responses[v]);

    }
}
