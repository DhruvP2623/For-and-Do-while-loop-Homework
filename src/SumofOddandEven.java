//Java Program to see the sum of the odd and even number using a while loop & if-els in program.
import java.util.Scanner;

public class SumofOddandEven {
static int i;//Declare variable
    //Declaring main method
    public static void main(String[] args) {
        int odd_sum = 0, even_sum = 0;
// Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an 5 Digit Number: ");
        int x = scanner.nextInt();//get input from the user for number

        //Using while loop
            while (x > 0) {
                i = x % 10;  // to find the remainder

//using if-else to print output of even and odd number
                if (i % 2 == 0)
                    even_sum = even_sum + i;

                 else
                    odd_sum = odd_sum + i;
                  x =x/10;

            }
        System.out.println("Sum of the Even number: " + even_sum);
        System.out.println("Sum of the odd number: " + odd_sum);
        }
    }





