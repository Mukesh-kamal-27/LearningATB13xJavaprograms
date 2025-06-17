package User_Input;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter first side length of triangle");
        int side1 = scanner.nextInt();
        System.out.println("Enter second side length of triangle");
        int side2 = scanner.nextInt();
        System.out.println("Enter third side length of triangle");
        int side3 = scanner.nextInt();
        if (side1==side2 && side2==side3)
        {
            System.out.println("This is equilateral Triangle");
        } else if (side1==side2 ||side2==side3 ||side2==side3) {
            System.out.println("This is isosceles triangle");
        }
        else {
            System.out.println("This is scalene triangle");

        }

    }
}
