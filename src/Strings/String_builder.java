package Strings;

import java.util.Scanner;

public class String_builder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String str = scanner.next();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string is "+ reversed);
        if (str.equalsIgnoreCase(reversed)){
            System.out.println("string is palindrome");
        } else{
            System.out.println("Not palindrome");
        }
    }
}
