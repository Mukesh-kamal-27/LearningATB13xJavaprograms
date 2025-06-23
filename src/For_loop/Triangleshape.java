package For_loop;

import java.util.Scanner;

public class Triangleshape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row =scanner.nextInt();
        for (int i=1 ; i<=row;i++){
            for (int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
