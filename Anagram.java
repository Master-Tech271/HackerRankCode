import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char str1[] = a.toCharArray();
        char str2[] = b.toCharArray();
        for(int i=0; i<str1.length-1; i++){
            for(int j=i; j<str1.length; j++){
                char temp;
                if(str1[i]>str1[j]){
                    temp = str1[i];
                    str1[i] = str1[j];
                    str1[j] = temp;
                }
            }
        }
        int minIndex;
        for(int i=0; i<str2.length; i++)
        {
            minIndex = i;
            for(int j=i; j<str2.length; j++){
                if(str2[minIndex]>str2[j])
                {
                    minIndex = j;
                }
            }
                if(minIndex!=i){
                    char temp = str2[minIndex];
                str2[minIndex] = str2[i];
                str2[i] = temp;
                }
            
        }
    
        for(int i=0; i<str1.length; i++ ){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

