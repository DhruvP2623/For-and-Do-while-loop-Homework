//Java Program to see the Multiplication table using a for loop in program.
import java.util.Scanner;

public class MultiplicationTable
{
    //Declaring Main method
    public static void main(String[] args) {

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x = scanner.nextInt();//get input from the user for number

        //Declaring for loop
        for (int i = 1; i <=10; i++) {
            System.out.println("Table of " + x + " x " + i + " = " +(x*i));

        }

    }

}
