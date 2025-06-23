package For_loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rverse_triangle_shape {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of row");
        int row = scanner.nextInt();
        for (int i=row;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
