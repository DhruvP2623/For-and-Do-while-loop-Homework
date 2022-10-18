//Java Program to see the sum of the first and last digit using a while  loop in program.
import java.util.Scanner;

public class SumofFirstandLast
{
    static int sum, firstDigit, lastDigit;//Declaring variable
    //Declaring Main method
    public static void main(String[] args) {

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Natural Number: ");
        int x = scanner.nextInt();//get input from the user for number
        lastDigit = x %10;

        //Using while loop
       while (x >=10) {
           x = x / 10;
       }
            firstDigit = x;

            sum = firstDigit + lastDigit;
            System.out.println(sum);





    }
}
