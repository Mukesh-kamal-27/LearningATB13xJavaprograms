package For_loop;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        for (int i=1; i<=10; i++)
        {
        System.out.println(number+ "X"+ i+"="+ (number*i));
           }
    }
}
