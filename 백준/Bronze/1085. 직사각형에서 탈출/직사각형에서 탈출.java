import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int h=sc.nextInt();
        int w=sc.nextInt();

        int arr[]={x, y, Math.abs(h-x), Math.abs(w-y)};

        int min=arr[0];
        for(int i:arr){
            if(min>i){
                min=i;
            }
        }
        System.out.println(min);
    }
}
