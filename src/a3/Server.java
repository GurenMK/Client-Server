
package a3;

import java.net.*; 
import java.io.*; 
import java.util.Scanner;

public class Server { 
    
 public static void main(String[] args) throws IOException { 
     ServerSocket s1 = new ServerSocket(13022);
        Socket ss = s1.accept(); 
        Scanner input = new Scanner(ss.getInputStream());
        int number = input.nextInt();
        
        int temp = number * 2;
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);
        s1.close();
        input.close();
   } 
} 