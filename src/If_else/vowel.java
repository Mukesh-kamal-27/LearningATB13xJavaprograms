package If_else;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            System.out.println("Vowel");
        else {
            System.out.println("consonant");
        }


    }
}
