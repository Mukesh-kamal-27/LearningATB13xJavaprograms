package User_Input;

import java.util.Scanner;

public class Input_scanner_class_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B");
        int b=scanner.nextInt();
        int c = a+b;
        System.out.println("Addition of A and B is "+c);
    }
}
