//Java Program to see the 10 number should be print using a for loop in program.
import java.util.Scanner;

public class Print10Number
{
    //Declaring Main Method
    public static void main(String[] args) {

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any First and last Number For e.g First Number is 10 & Last number is 20 ");
        System.out.println("Enter First Number : ");
        int a = scanner.nextInt();//get input from the user for number a
        System.out.println("Enter Last Number: ");
        int b = scanner.nextInt();//get input from the user for number b
        //Declaring for loop
        for (int i = a; i<=b; i++) {

            System.out.println(i);
        }


    }
}
