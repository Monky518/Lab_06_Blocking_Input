import java.util.Scanner;
import java.util.Random;

public class HighOrLow
{
    public static void main(String[] args)
    {
        //Write a program that has the computer generate a random int value (1 to 10) inclusive
        //The program then asks the user to guess the number with a single guess
        //The program displays the random number and then indicates if the users guess was high low or on the money!
        //Use the do while loop again to bulletproof the guess

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String trash;
        boolean validInput = false;

        int computerNum;
        int playerNum = 0;

        do
        {
            System.out.print("Guess a number [1 - 10]: ");
            if (in.hasNextInt())
            {
                playerNum = in.nextInt();
                in.nextLine();
                if (playerNum > 10 || playerNum < 1)
                {
                    System.out.println("You incorrectly entered: " + playerNum);
                }
                else
                {
                    validInput = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You incorrectly entered: " + trash);
            }
        }while(!validInput);

        //the range is 0 to 9, so adding 1 creates a 1 to 10 range
        computerNum = (rand.nextInt(10)) + 1;

        if (computerNum == playerNum)
        {
            System.out.println("You are a winner! You guessed the computer guess " + computerNum + " correctly!");
        }
        else if (computerNum > playerNum)
        {
            System.out.println("The computer guessed " + computerNum + ", so you guessed too low. Better luck next time!");
        }
        else
        {
            System.out.println("The computer guessed " + computerNum + ", so you guessed too high. Better luck next time!");
        }
    }
}
