/*Java Program to see user input string and in output it should come count total number of a in that String
 by using a for loop in program.
 */

public class Stringnumbercount
{

    public static int count(String s, char c){
         int res = 0;
         //Using for loop
        for (int i = 0; i <s.length(); i++) {

            if (s.charAt(i) == c)
                res++;

        }
        return res;
    }
    //Declaring Main method
    public static void main(String[] args) {


        String str = "ansh Patel is smart Boy ";
        char c = 'a';
        System.out.println(count(str, c));



        }
    }

