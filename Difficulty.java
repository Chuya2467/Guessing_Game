package Guessing_Game;

public enum Difficulty
{
    //difficulty levels and related values
    EASY(50, 10),
    MEDIUM(100, 7),
    HARD(200,5);

    //private variables
    private int maxNumber;
    private int attempts;

    //constructor
    Difficulty(int maxNumber, int attempts)
    {
        this.maxNumber = maxNumber;
        this.attempts = attempts;
    }

    //getter for maximum number
    public int getMaxNumber()
    {
        return maxNumber;
    }

    //getter for number of attempts
    public int getAttempts()
    {
        return attempts;
    }
}