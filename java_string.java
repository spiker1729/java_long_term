import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(((A).concat(B).length()));
        int ans=A.compareTo(B);
        if(ans>1)
        {
            System.out.println("Yes");
        }
        else{
                        System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
    }
}



//https://www.hackerrank.com/challenges/java-strings-introduction