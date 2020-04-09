import java.util.*;
import java.io.*;

class MapSolution{
	public static void main(String []argh)
	{
        Map<String, Integer> contact = new HashMap<>();
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            contact.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            if(contact.containsKey(s)){
                System.out.println(s+"="+contact.get(s));
            }
            else{
                System.out.println("Not found");
            }
		}
	}
}




