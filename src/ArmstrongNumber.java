//Java Program to see the Armstrong Number using a for loop program.
import java.util.Scanner;

public class ArmstrongNumber
{
    //Declaring Main Method

    public static void main(String[] args) {

        int r, temp,result = 0;//Declare variable

        // Take input from the user
        // create an object of Scanner class
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter an 4 Digit Number: ");
      int number = scanner.nextInt(); //get input from the user for number

        //Declare for loop
        for (temp=number;number!=0;number=number/10){

           r=number % 10;
           result = result+ (r*r*r*r);
           

        }
        // if num is equal to result, the number is an Armstrong number
        if (result == temp)
            System.out.println( temp+ " is an Armstrong Number");
            // if num is not equal to result, the number is not an Armstrong number
        else
            System.out.println( temp + " is not an Armstrong Number ");




    }

}
