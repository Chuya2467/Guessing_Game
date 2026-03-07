package Guessing_Game;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
    private Random random = new Random();
    private Scanner input;
    private int maxNumber;
    private int tries;
    private int gameNumber = 1;

    public Game(Scanner input, int maxNumber, int tries)
    {
        this.input = input;
        this.maxNumber = maxNumber;
        this.tries = tries;
    }

    public void play()
    {
        int secretNumber = random.nextInt(maxNumber) + 1;
        int guess;
        System.out.println("----------GAME " + gameNumber + "----------");

        for(int i = 0; i < tries; i++)
        {
            System.out.print("Please enter your guess: ");
            guess = input.nextInt();

            if(guess < secretNumber)
                System.out.println("Too low");
            else if(guess > secretNumber)
                System.out.println("Too high");
            else
            {
                System.out.println("YOU WON! Secret number was " + secretNumber);
                return;
            }
        }

        System.out.println("You loose! Secret number was " + secretNumber);
    }
}
