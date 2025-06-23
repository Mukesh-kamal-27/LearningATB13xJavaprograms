package Strings;

public class String_functions {
    public static void main(String[] args) {
        String str = new String("Mukesh");
        System.out.println("string length is "+str.length());
        System.out.println("5th letter of string is "+str.charAt(4));
        System.out.println(str.contains("uk"));
        System.out.println(str.equals("Mukesh"));
        System.out.println(str.trim());
        System.out.println(str.substring(3,6));
        System.out.println(str.substring(3));
    }
}
