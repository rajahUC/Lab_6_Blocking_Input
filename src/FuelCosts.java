import java.util.Scanner;

public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double numberOfGallons = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        double pricePer100 = 0;
        double maxDistance = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if(in.hasNextDouble())
            {
                numberOfGallons = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Try again.");
            }
        }while (!done);

        done = false;

        do
        {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Try again.");
            }
        }while (!done);

        done = false;

        do
        {
            System.out.print("Enter the price of gas per gallon: ");
            if(in.hasNextDouble())
            {
                pricePerGallon = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Invalid input: " + trash + ". Try again.");
            }
        }while (!done);

        pricePer100 = pricePerGallon / fuelEfficiency;
        System.out.println("The cost per 100 miles is " + pricePer100);

        maxDistance = fuelEfficiency * numberOfGallons;
        System.out.println("The approximate maximum distance the car can go with the gas in the tank is " + maxDistance);

    }
}
