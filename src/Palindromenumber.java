//Java Program to see the Palindrome number using a while loop in program.
import java.util.Scanner;

public class Palindromenumber
{
    static  int num,n,sum=0,temp;
    //Declaring main method
    public static void main(String[] args) {

        // Take input from the user
        // create an object of Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Palindrome Number: ");
        int num = scanner.nextInt();//get input from the user for number
        temp=num;
        //Declaring while loop
        while (num>0){

            n=num%10;
            sum=(sum*10)+n;
            num=num/10;
        }
        //Using if-else to print out output
        if (temp==sum)
            System.out.println("It is Palindrome Number: ");

        else
            System.out.println("Not a Palindrome Number: ");



    }
}
