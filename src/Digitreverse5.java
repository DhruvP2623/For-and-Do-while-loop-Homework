//Java Program to see the 5digit number and then reverse it using a for loop program.

import java.util.Scanner;

public class Digitreverse5
{
    //Declaring main method
    public static void main(String[] args) {

        int  reverseA = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 Digit Number: ");//This statement will capture the user input
        int a = scanner.nextInt();//Captured input would be stored in number a
        /* for loop: No initialization part as a is already
         * initialized and no increment/decrement part as logic
         * a = a/10 already decrements the value of a
         */
        for (;a !=0;){
            reverseA = reverseA * 10;
            reverseA = reverseA + a%10;
            a = a/10;
        }
        System.out.println("Reverse Number is: " + reverseA);

    }
}
