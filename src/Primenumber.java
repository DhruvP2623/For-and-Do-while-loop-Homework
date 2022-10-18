//Java Program to see the Prime number using a for loop & if-else in program.
import java.util.Scanner;

public class Primenumber
{
    //Declaring Main method
    public static void main(String[] args) {

boolean isPrime=false;

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Number: ");
        int a = scanner.nextInt();//get input from the user for num1

        //Declaring for loop
        for (int i = 2; i <= a/2 ; i++) {
            //condition for non-prime
            if (a % i == 0) {
                isPrime = true;
                break;
            }
        }

        //using if-else to print out output
            if(!isPrime){
                System.out.println(a + "is a prime number.");
            }
            else {
                System.out.println(a + "is not a prime number.");
            }




    }
}
