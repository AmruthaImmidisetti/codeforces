import java.util.*;
import java.io.*;

public class codeForces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t>0){
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a+b == c || b+c == a || c+a == b){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t--;
        }
        sc.close();
    }
}
