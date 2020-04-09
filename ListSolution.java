import java.io.*;
import java.util.*;

public class ListSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> l = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n--;
        Integer i;
        while(n!=-1){
            int ii = in.nextInt();
            i = Integer.valueOf(ii);
            l.add(ii);
            n--;
        }
        int q = in.nextInt();
        in.nextLine();
        while(q!=0){
            String str = in.nextLine();
            if(str.equals("Insert")){
                String[] el = in.nextLine().split(" ");
            int x = Integer.parseInt(el[0]);
            int y = Integer.parseInt(el[1]);
            i = Integer.valueOf(y);
            l.add(x, i);
            }
            else{
                int rem = Integer.parseInt(in.nextLine());
                l.remove(rem);
            }
            q--;
        }
        Iterator it = l.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
