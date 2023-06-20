import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int val = generator.nextInt(10) + 1;

        Scanner in = new Scanner(System.in);
        int guess = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter your guess [1-10]: ");
            if(in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Try again.");
            }
        }while (!done);

        if (guess < val)
        {
            System.out.println("Your guess of " + guess + " was below the value of " + val);
        }
        else if (guess > val)
        {
            System.out.println("Your guess of " + guess + " was above the value of " + val);
        }
        else
        {
            System.out.println("Your guess of " + guess + " was right on the money!");
        }

    }
}
