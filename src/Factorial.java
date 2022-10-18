//Java Program to see the Factorial using a for loop program.
import java.util.Scanner;

public class Factorial
{
    // Print Factorial number of any number.
    //Declaring Main method
    public static void main(String[] args) {
        int fac=1; // Declaring Local Variable for the Factorial Number

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("EnterNumber: ");
        int x = scanner.nextInt();//get input from the user for Factorial number

        //Declaring for loop
        for (int i = 1; i <=x ; i++) {
            fac = fac * i;
        }
        System.out.println(fac);


    }
}
