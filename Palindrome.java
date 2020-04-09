import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char str[] = new char[A.length()];
        for(int i=A.length()-1; i>=0; i--){
            for(int j=(A.length()-1)-i; j<=i; j++)
                 str[j] = A.charAt(i);
        }
        char m[] = A.toCharArray();
        if(Arrays.equals(str, m)){
            System.out.println("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}




