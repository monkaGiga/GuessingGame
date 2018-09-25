package BYu;

import java.util.Scanner;

public class GuessingGame {

    public static void GuessingGame()
    {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine ();
        System.out.print("Hello" + name);
        System.out.println("Welcome to the guessing game" + name + "Enter a number 1 to 4 to choose your difficulty");
        System.out.println("The higher the number, the harder it is");
        String diff = input.nextLine ();
        System.out.println("You have picked" + diff);

        if (diff.equals(1))
        {
            double ans = Math.ceil(Math.random() * 10);
            System.out.println("Your range of numbers if from 1 to 10, Good luck");
            int guess = 0;
            while (guess != ans)
            {
                guess = input.nextInt ();
                if (guess == ans) {
                    System.out.println("That's right, Good job");
                }
                if (guess < ans) {
                    System.out.println("That's not right, Try a little higher this time");
                }
                if (guess > ans) {
                    System.out.println("That's not right, Try a little lower this time");
                }
            }
        }
        if (diff.equals(2))
        {
            double ans = Math.ceil(Math.random() * 100);
            System.out.println("Your range of numbers if from 1 to 100, Good luck");
            int guess = 0;
            while (guess != ans)
            {
                guess = input.nextInt ();
                if (guess == ans) {
                    System.out.println("That's right, Good job");
                }
                if (guess < ans) {
                    System.out.println("That's not right, Try a little higher this time");
                }
                if (guess > ans) {
                    System.out.println("That's not right, Try a little lower this time");
                }
            }
        }
        if (diff.equals(3))
        {
            double ans = Math.ceil(Math.random() * 1000);
            System.out.println("Your range of numbers if from 1 to 1000, Good luck");
            int guess = 0;
            while (guess != ans)
            {
                guess = input.nextInt ();
                if (guess == ans) {
                    System.out.println("That's right, Good job");
                }
                if (guess < ans) {
                    System.out.println("That's not right, Try a little higher this time");
                }
                if (guess > ans) {
                    System.out.println("That's not right, Try a little lower this time");
                }
            }
        }
        if (diff.equals(4))
        {
            double ans = Math.ceil(Math.random() * 10000);
            System.out.println("Your range of numbers if from 1 to 10000, Good luck");
            int guess = 0;
            while (guess != ans)
            {
                guess = input.nextInt ();
                if (guess == ans) {
                    System.out.println("That's right, Good job");
                }
                if (guess < ans) {
                    System.out.println("That's not right, Try a little higher this time");
                }
                if (guess > ans) {
                    System.out.println("That's not right, Try a little lower this time");
                }
            }
        }
    }




}
