package Assignment.Recursion7;

import java.util.Scanner;

public class LowerCaseChar {
    static int NumberOfLower(String s){
        if (s.isEmpty()) return 0;
        int ans=0;
        if (s.charAt(0)>='a'&&s.charAt(0)<='z')
            ans=1;
        return ans+NumberOfLower(s.substring(1));
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(NumberOfLower(s));
    }
}
