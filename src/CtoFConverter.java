import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double celsius = 0.0;
        double fahrenheit = 0.0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Enter a temperature in Celsius: ");
            if(in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
            }
        }while (!done);

        fahrenheit = (celsius * (9.0 / 5)) + 32;
        System.out.println("For " + celsius + " degrees celsius, it would be " + fahrenheit + " degrees fahrenheit");

    }
}