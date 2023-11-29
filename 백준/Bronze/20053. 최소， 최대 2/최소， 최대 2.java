import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static int n;
    public static int map[][];
    public static boolean check[][];
    public static int xd[] = {0,0,-1,1};
    public static int yd[] = {-1,1,0,0};
    public static int count=0;
    public static int apartArr[];


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int arr[] = new int[N];


            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }

            int min = arr[0];
            int max = arr[0];

            for(int j : arr){
                if(min>j){
                    min = j;
                }
            }
            for(int j : arr){
                if(max<j){
                    max = j;
                }
            }

            System.out.println(min+" " +max);

        }

        sc.close();
    }
}