package Ternary_operator;

public class Nested_Ternary {
    public static void main(String[] args) {
        int marks= 35;
        String Result = (marks>=90) ? "A+": (marks>=70) ?"A" :(marks>=60)?"B":(marks>=40)?"C":"fail";
        System.out.println(Result);

    }
}
