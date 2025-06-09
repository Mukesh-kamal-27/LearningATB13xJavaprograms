package Ex_01_Java_Basics;

public class swapping_numbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("a is " + a + " and b is " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swap a is " + a + " and b is "+ b);
    }
}
