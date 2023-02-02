// WAP to get to numbers from user and add it and disply it
// Done by Shahil Dhakal
// BESE NCIT
// 3rd sem morning

import java.util.InputMismatchException;
import java.util.Scanner;

class AddTwoNumber{
    static Scanner scan = new Scanner(System.in);
    public static void main (String [] args)
    {
        try{
            System.out.println("Input a number: ");
            int a = scan.nextInt();
            System.out.println("Input another number: ");
            int b = scan.nextInt();
            int c = a + b;
            System.out.println("The sum is : " + c);
        }
        catch(ArithmeticException e)
        {
            System.out.print("Infinity.");
        }
        catch(InputMismatchException e)
        {
            System.out.print("Input integers only.");
        }
        finally{
            System.out.print("Exit");
        }
    }
}