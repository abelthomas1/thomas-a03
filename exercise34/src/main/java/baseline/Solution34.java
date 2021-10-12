/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.*;

public class Solution34 {

    void removeName(ArrayList names, String del)
    {
        names.remove(del);
    }

    public static void main(String []args)
    {

        /*
        print a list of names
        prompt the user to enter a name to remove
        print the list again with the selected name removed
         */


        Solution34 obj=new Solution34();

        ArrayList<String> names=new ArrayList();
        names.add("John Smith");
        names.add("Jackie Jackson");
        names.add("Chris Jones");
        names.add("Amanda Cullen");
        names.add("Jeremy Goodwin");
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println(names.get(i));
        }

        System.out.println("\nEnter an employee name to remove: ");
        String del=sc.nextLine();
        obj.removeName(names,del);


        System.out.println("\n" + names);
    }
}
