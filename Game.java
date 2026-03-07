package Guessing_Game;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
    private Random random = new Random();
    private Scanner input;
    private int maxNumber;
    private int tries;

    public Game(Scanner input, int maxNumber, int tries)
    {
        this.input = input;
        this.maxNumber = maxNumber;
        this.tries = tries;
    }

    public void play(int gameNumber)
    {
        int secretNumber = random.nextInt(maxNumber) + 1;
        int guess;

        System.out.println("----------GAME " + gameNumber + "----------");

        for(int i = tries; i > 0; i--)
        {
            System.out.print("Please enter your guess: ");
            guess = input.nextInt();

            if(guess < secretNumber)
                System.out.println("Too low.  " + (i - 1) + " attempts left");
            else if(guess > secretNumber)
                System.out.println("Too high. " + (i - 1) + " attempts left");
            else
            {
                System.out.println("YOU WON! Secret number was " + secretNumber);
                System.out.println("Returning to menu...\n\n");
                return;
            }
        }

        System.out.println("You lose! Secret number was " + secretNumber);
        System.out.println("Returning to menu...\n\n");
    }
}
