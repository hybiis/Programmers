import java.util.*;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        a=(a%10*100) + (a%100-a%10) + (a/100);
        b=(b%10*100) + (b%100-b%10) + (b/100);

        int answer=Math.max(a,b);


       System.out.println(answer);
	}
}
