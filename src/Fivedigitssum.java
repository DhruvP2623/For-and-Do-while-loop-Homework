//Java Program to see the 5 Digit Sum using a while loop program.
import java.util.Scanner;

public class Fivedigitssum
{
    //Declaring main method
    public static void main(String[] args) {
        int sum =0;
        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 Digits Number: ");
        int num = scanner.nextInt();//get input from the user for 5Digit number

        //Using while loop
        while(num !=0){

            sum += num % 10;
            num = num/10;
        }
        System.out.println(sum);

    }
}
