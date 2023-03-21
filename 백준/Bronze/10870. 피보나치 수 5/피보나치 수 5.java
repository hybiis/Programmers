import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();

        System.out.println(Fibo(N));

    }
    static int Fibo(int N){
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }

        return Fibo(N-1)+Fibo(N-2);
    }
}
