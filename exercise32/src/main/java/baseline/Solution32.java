/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Abel Thomas
 */

package baseline;

import java.util.*;

public class Solution32 {
    public static void main(String[] args) {

        /*
        prompt the user to choose the difficulty level
        the first level of difficulty would be a number between 1 and 10,
        the second difficulty set would be between 1 and 100,
        and the third difficulty set would be between 1 and 1000
        each time the player guesses a number give a hint whether the number is higher or lower than the answer
        once the player guesses the correct number, print the total number of guesses and prompt to play again
         */

        System.out.println("Let's play Guess the Number!");
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        Scanner sc = new Scanner(System.in);
        int guess,total=0,key;

        while(true){

            total=0;

            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=sc.nextInt();

            if(key==1)
                secretNumber = (int) (Math.random() * 10 + 1);
            else if(key==2)
                secretNumber = (int) (Math.random() * 100 + 1);
            else
                secretNumber = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = sc.nextInt();
                total++;
                if (guess == secretNumber){
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < secretNumber)
                    System.out.println("Too low. Guess again: ");
                else System.out.println("Too high. Guess again: ");

            }while (guess != secretNumber);

            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=sc.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }

    }
}
