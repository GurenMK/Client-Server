
package a3;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Scanner input = new Scanner(System.in);
        Socket echoSocket = new Socket("127.0.0.1", 13022);
        Scanner input1 = new Scanner(echoSocket.getInputStream());
        System.out.println("Enter any number: ");
        int number = input.nextInt();
        PrintStream p = new PrintStream(echoSocket.getOutputStream());
        p.println(number);
        int temp = input1.nextInt();
        System.out.println(temp);
        input.close();
        echoSocket.close();
        input1.close();
    }
}
