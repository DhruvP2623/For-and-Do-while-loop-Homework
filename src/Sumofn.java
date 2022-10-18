//Java Program to see the sum of n number using a for loop in program.
import java.util.Scanner;

public class Sumofn
{
static int sum;
    //Declaring main method
    public static void main(String[] args) {

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Natural Number: ");
        int x = scanner.nextInt();//get input from the user for number

        //Using for loop
        for (int i = 1; i <= x ; ++i) {

            sum = sum + i;
            System.out.println(sum);

        }


    }

}
