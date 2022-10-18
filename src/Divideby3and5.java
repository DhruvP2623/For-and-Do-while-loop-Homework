//Java Program to see the number is divided by 3&5 using a for loop program.

public class Divideby3and5 {
    //Declaring Main method

    public static void main(String[] args) {
        //Using for output to print in the console for divide by 3
        System.out.println("Divide by 3: ");
        //Declaring for loop for number divide by 3
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");
        }
        System.out.println();
        //Using for output to print in the console for divide by 5
        System.out.println("\nDivide by 5: ");// \n means to print in the next line
        ////Declaring for loop for number divide by
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");
        }


    }
}


