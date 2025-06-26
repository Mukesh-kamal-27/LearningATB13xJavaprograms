package Test_26_June;

public class Challenge_02 {
    public static void main(String[] args) {
        String string1 ="Hello";
        String string2="hello";
        String string3 ="Hello";
        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string3));
        System.out.println(string1.compareTo(string2));
    }
}
