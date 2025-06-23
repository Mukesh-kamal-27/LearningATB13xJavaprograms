package Method;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the first number a");
        int a = scanner.nextInt();
        System.out.println("Enter the 2nd number b");
        int b =scanner.nextInt();
        int Addition = sum(a,b);
        System.out.println("Addition is "+Addition);

        int subtraction = sub(a,b);
        System.out.println("subtraction is "+ subtraction);

        int multiplication = mul(a,b);
        System.out.println("multiplication is " +multiplication);

        float devision = div(a,b);
        System.out.println("devision is " + devision);
    }
    static int sum (int a , int b){
        return a+b;
    }
    static int sub (int a,int b){
        return a-b;
    }
    static int mul (int a,int b){
        return a*b;
    }
    static float div (float a,float b){
        return a/b;
    }
}
