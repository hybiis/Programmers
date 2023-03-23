import java.util.*;
public class Main {
    static  long seq[];
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);

        int n=sc.nextInt();
        seq = new long[n + 1];

        for(int i = 0; i < n + 1; i++) {
            seq[i] = -1;
        }
        seq[0]=0;
        seq[1]=1;
        System.out.println(fido(n));
    }
    public static long fido(int n){
        if(seq[n]==-1){
            seq[n]=fido(n-1)+fido(n-2);
        }
        return seq[n];
    }
}