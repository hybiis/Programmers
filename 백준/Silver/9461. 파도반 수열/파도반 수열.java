import java.util.*;
public class Main {

    public static Long[] seq =new Long[101];
    public static long pado (int n){
        if(seq[n]==null){
            seq[n]=pado(n-2)+pado(n-3);
        }
    return seq[n];
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        seq[0]=0L;
        seq[1]=1L;
        seq[2]=1L;
        seq[3]=1L;

        int a=sc.nextInt();

        while(a --> 0){
            int n=sc.nextInt();
            System.out.println(pado(n));
        }

    }
}