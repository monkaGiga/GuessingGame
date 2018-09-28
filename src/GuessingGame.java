package BYu;

import java.util.Scanner;

public class GuessingGame {

    public static void Game()
    {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine ();
        System.out.print("Hello " + name);
        System.out.println();
        System.out.println("Welcome to the guessing game.");
        System.out.println("Enter 1 to guess a number and enter 2 to pick a number for me to guess");
        String mode = input.nextLine();
        if (mode.equals("1"))
        {
            System.out.println("Enter a number 1 to 4 to choose your difficulty " + name);
            System.out.println("The higher the number, the harder it is");
            String diff = input.nextLine();
            System.out.println("You have picked " + diff);


            if (diff.equals("1")) {
                double ans = Math.ceil(Math.random() * 10);
                System.out.println("Your range of numbers is from 1 to 10, Good luck "+ name);
                int guess = 0;
                while (guess != ans)
                {
                    guess = input.nextInt();
                    if (guess == ans)
                    {
                        System.out.println("That's right, Good job " + name);
                    }
                    if (guess < ans)
                    {
                        System.out.println("That's not right, try a little higher this time");
                    }
                    if (guess > ans)
                    {
                        System.out.println("That's not right, try a little lower this time");
                    }
                }
            }
            if (diff.equals("2")) {
                double ans = Math.ceil(Math.random() * 100);
                System.out.println("Your range of numbers is from 1 to 100, Good luck " + name);
                int guess = 0;
                while (guess != ans)
                {
                    guess = input.nextInt();
                    if (guess == ans)
                    {
                        System.out.println("That's right, Good job " + name);
                    }
                    if (guess < ans)
                    {
                        System.out.println("That's not right, try a little higher this time");
                    }
                    if (guess > ans)
                    {
                        System.out.println("That's not right, try a little lower this time");
                    }
                }
            }
            if (diff.equals("3")) {
                double ans = Math.ceil(Math.random() * 1000);
                System.out.println("Your range of numbers is from 1 to 1000, Good luck " + name);
                int guess = 0;
                while (guess != ans)
                {
                    guess = input.nextInt();
                    if (guess == ans)
                    {
                        System.out.println("That's right, Good job " + name);
                    }
                    if (guess < ans)
                    {
                        System.out.println("That's not right, try a little higher this time");
                    }
                    if (guess > ans)
                    {
                        System.out.println("That's not right, try a little lower this time");
                    }
                }
            }
            if (diff.equals("4")) {
                double ans = Math.ceil(Math.random() * 10000);
                System.out.println("Your range of numbers is from 1 to 10000, Good luck " + name);
                int guess = 0;
                while (guess != ans) {
                    guess = input.nextInt();
                    if (guess == ans)
                    {
                        System.out.println("That's right, Good job " + name);
                    }
                    if (guess < ans)
                    {
                        System.out.println("That's not right, try a little higher this time");
                    }
                    if (guess > ans)
                    {
                        System.out.println("That's not right, try a little lower this time");
                    }
                }
            }
        }
        if (mode.equals("2"))
        {
            System.out.println("Pick a number from 1 to 100");
            String targ = input.nextLine();
            System.out.println("Your number is " + targ);
            System.out.println("As i guess type higher if my guess is too low");
            System.out.println("lower if my guess is too high");
            System.out.println("and correct if my answer is correct");
            System.out.println("Is your number 50?");
            int guess = 50;
            int ciel = 100;
            int floor = 0;
            String res = input.nextLine();
            while (res != "correct" )
            {
                if (res.equals("correct"))
                {

                    System.out.println("Thanks for playing " + name);
                    res = "ncorrect";

                }
                if (res.equals("higher"))
                {
                    floor = guess;
                    guess = (floor + ciel)/2;
                    System.out.println("Is your number " + guess + "?");
                    res = input.nextLine();
                }
                if (res.equals("lower"))
                {
                    ciel = guess;
                    guess = (floor + ciel)/2;
                    System.out.println("Is your number " + guess + "?");
                    res = input.nextLine();
                }


            }





        }
    }




}
