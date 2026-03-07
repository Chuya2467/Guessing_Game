package Guessing_Game;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
    //private varibles
    private Random random = new Random();
    private Scanner input;
    private int maxNumber;
    private int tries;

    //constructor
    public Game(Scanner input, int maxNumber, int tries)
    {
        this.input = input;     //using 1 Scanner for the whole program to avoid problems with inputs
        this.maxNumber = maxNumber;
        this.tries = tries;
    }

    //method to play a game
    public void play(int gameNumber)
    {
        int secretNumber = random.nextInt(maxNumber) + 1;   //generating random number
        int guess;

        System.out.println("----------GAME " + gameNumber + "----------");

        //loop where user tries to guess a secret number
        for(int i = tries; i > 0; i--)
        {
            System.out.print("Please enter your guess: ");

            //try-catch for unexpected input like letters
            try
            {
                guess = input.nextInt();
            }
            catch (InputMismatchException e) 
            {
                System.out.println("Unexpected input");
                input.next();
                i++;
                continue;
            }

            if(guess < secretNumber)
                System.out.println("Too low.  " + (i - 1) + " attempts left");
            else if(guess > secretNumber)
                System.out.println("Too high. " + (i - 1) + " attempts left");
            else
            {
                System.out.println("YOU WON! Secret number was " + secretNumber);
                System.out.println("Returning to menu...\n\n");     //returning back to menu in Main.java
                return;
            }
        }

        System.out.println("You lose! Secret number was " + secretNumber);
        System.out.println("Returning to menu...\n\n");             //returning back to menu in Main.java
    }
}
