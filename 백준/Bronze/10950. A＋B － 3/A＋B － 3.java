import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            int k=sc.nextInt();
            int j=sc.nextInt();
            arr[i]=k+j;
        }

        for(int i:arr){
            System.out.println(i);
        }

    }
}
