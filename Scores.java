package Guessing_Game;
import java.io.FileWriter;
import java.io.IOException;

public class Scores 
{
    public void write(boolean result, int gameNumber)
    {
        try(FileWriter writer = new FileWriter("result.txt", true);) 
        {
            if(result)
                writer.write("Game " + gameNumber + " won!\n");
            else
                writer.write("Game " + gameNumber + " lost!\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}