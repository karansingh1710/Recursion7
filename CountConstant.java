package Assignment.Recursion7;

import java.util.Scanner;

public class CountConstant {
//    This method takes a string and return the number of Constant present in the string
//    wallah->w,l,l,h=4
    static int Count(String s) {
        if (s.isEmpty()) return 0;
        int ans=0;//This ans, variable store the number of constant at present index
        char c=s.charAt(0);//We have precalculated the present char at the first index because we have to use it many times in the if condition
        if (c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
         ans= 1;
// Self-work is we have to simply add the ans in the recursive function what they return
       return  Count(s.substring(1))+ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(Count(s));
    }
}
