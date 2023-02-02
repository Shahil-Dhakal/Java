// WAP to get string from user and write it in a file
// Done by Shahil Dhakal
// BESE NCIT
// 3rd sem morning

import java.util.Scanner;
import java.io.*;

class Write{
    static Scanner scan = new Scanner(System.in);
    public static void main(String [] args)
    {
        try{
            FileOutputStream f = new FileOutputStream("file.txt");
            System.out.println("Input a message: ");
            String msg = scan.nextLine();
            byte [] b = msg.getBytes();
            f.write(b);
            f.close();
       }
       catch(IOException e)
       {
        System.out.println(e.getMessage());
       }
    }
}