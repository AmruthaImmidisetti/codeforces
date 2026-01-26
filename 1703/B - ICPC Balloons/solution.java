import java.util.*;
import java.lang.*;
import java.io.*;

public class ICPCBalloons
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    sc.nextLine();
	    while(t > 0) {
	        int n = sc.nextInt();
	        String s = sc.next();
	        HashMap<Character, Integer> mp = new HashMap<>();
	        for(int i = 0; i < n; i++){
	            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i),0)+1);
	        }
	        int size = mp.size();
	        int ans = (size*2) + (n - size);
	        System.out.println(ans);
	        t--;
	    }
	}
}
