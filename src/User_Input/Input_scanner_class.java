package User_Input;

import java.util.Scanner;

public class Input_scanner_class {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the value of age");
        int age = Scanner.nextInt();
        String CanIvote = age>=18 ? "yes you can vote":"you can not vote";
        System.out.println(CanIvote);
    }
}
