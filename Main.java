package Guessing_Game;
import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Difficulty difficulty = null;
        Game game;
        int userOptionDifficulty;
        char userInput;
        int gameNumber = 1;

        //user message
        System.out.println("----------Welcome to the guessing game!----------");
        System.out.println("There are 3 difficulty levels:\n");
        System.out.println("Easy: \t1-50 numbers range, \t10 attempts");
        System.out.println("Medium: 1-100 numbers range, \t7 attempts");
        System.out.println("Hard: \t1-200 numbers range, \t5 attempts\n");

        do
        {
            System.out.println("Please choose difficulty. Enter 1 for Easy, 2 for Medium, 3 for Hard or -1 to exit: ");
            userOptionDifficulty = input.nextInt();

            switch(userOptionDifficulty)
            {
                case 1:
                    difficulty = Difficulty.EASY;
                    break;
                case 2:
                    difficulty = Difficulty.MEDIUM;
                    break;
                case 3:
                    difficulty = Difficulty.HARD;
                    break;
                case -1:
                    System.out.println("Closing the game");
                    continue;
                default:
                    System.out.println("Unexpected input");
                    continue;
            }

            game = new Game(input, difficulty.getMaxNumber(), difficulty.getAttempts());
            game.play(gameNumber);
            gameNumber++;
            System.out.print("Would you like to continue?(y/n) ");
            userInput = input.next().charAt(0);
            switch(userInput)
            {
                case 'y':
                case 'Y':
                    continue;
                case 'n':
                case 'N':
                    System.out.println("Closing the game");
                    userOptionDifficulty = -1;
                    continue;
            }
            
        }while(userOptionDifficulty != -1);
    }
}