package User_Input;

import java.awt.*;
import java.util.Scanner;

public class Input_scanner_class3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a = scanner.nextInt();
        System.out.println("Enter the value of B");
        int b = scanner.nextInt();
        System.out.println("Enter the value of C");
        int c = scanner.nextInt();
        int MaxValue = (a>b) ? (a>c) ? a:c : (b>c) ? b:c;
        System.out.println("Max Value among three is "+MaxValue);
    }
}
