package Assignment.Recursion7;

import java.util.Scanner;

public class UppercaseWord {
    static String Uppercase(String s){
        if (s.isEmpty()) return "";
        if (s.charAt(0)>='A'&&s.charAt(0)<='Z') return s;
        return Uppercase(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Uppercase(s));
    }
}
