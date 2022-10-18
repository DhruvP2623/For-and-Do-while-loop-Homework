//Java Program to see the FibonacciSeries using a for loop and if-else in program.
import java.util.Scanner;

public class FibonacciSeries
{
    //Declaring Main Method
    public static void main(String[] args) {

        int firstTerm = 1, secondTerm =1;

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Fibonacci number: ");
        int n = scanner.nextInt();//get input from the user for Fibonacci number

        //Declaring for loop
        for (int i = 0; i <=n; i++) {
            if (i!=n)

            System.out.print(firstTerm + " , ");
            else System.out.print(firstTerm);//Line is use for the remove " , " at last in the console

            //Declaring method to count thr number
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}
