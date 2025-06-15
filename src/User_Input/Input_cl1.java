package User_Input;

public class Input_cl1 {
    public static void main(String[] args) {
        String age_string = args[0];
        System.out.println(age_string);
        int age = Integer.parseInt(age_string);
        String CanIvote = age>18 ? "you can vote": "you cant vote";
        System.out.println(CanIvote);

    }
}
