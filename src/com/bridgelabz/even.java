package com.bridgelabz;
import java.util.Scanner;
public class even {

        public static void main(String[] ards) {
            Scanner reader = new Scanner(System.in);
            System.out.print("enter a number: ");
            int num = reader.nextInt();
            if(num % 2 == 0)
                System.out.println(num + " is even");
            else
                System.out.println(num + " is odd");


        }


}
