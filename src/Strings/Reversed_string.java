package Strings;

import java.awt.*;
import java.util.Scanner;

public class Reversed_string {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scanner.next();
        String reversed = "";

        for (int i= str.length()-1; i>=0;i--)
        {
            reversed += str.charAt(i);

        }
        System.out.println("reversed string is "+ reversed);
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("This is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }


        }
    }

