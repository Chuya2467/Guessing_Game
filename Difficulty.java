package Guessing_Game;

public enum Difficulty
{
    EASY(50, 10),
    MEDIUM(100, 7),
    HARD(200,5);

    private int maxNumber;
    private int attempts;

    Difficulty(int maxNumber, int attempts)
    {
        this.maxNumber = maxNumber;
        this.attempts = attempts;
    }

    public int getMaxNumber()
    {
        return maxNumber;
    }

    public int getAttempts()
    {
        return attempts;
    }
}