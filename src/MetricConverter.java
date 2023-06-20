import java.util.Scanner;

public class MetricConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int meters = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";
        boolean done = false;

        System.out.print("Enter the number of meters: ");
        if(in.hasNextInt())
        {
            meters = in.nextInt();
            in.nextLine();
            done = true;
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Invalid Input: " + trash + ". Exiting program. Try again.");
            System.exit(0);
        }

        feet = meters * 3.28084;
        miles = meters * 0.00062137;
        inches = meters * 39.37;

        System.out.println(meters + " meters are " + miles + " miles, " + feet + " feet, or " + inches + " inches.");
    }
}
