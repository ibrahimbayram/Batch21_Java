package day17_String;

public class String_Char {
    public static void main(String[] args) {
        String str = "Cybertek";

        System.out.println(str.charAt(0));

        char second = str.charAt(1);
        System.out.println(second);
        char last = str.charAt(7);
        System.out.println(last);

       // System.out.println(str.charAt(100)); an error here
    }
}
