import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }

        int count2=0;
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    count++;
                }
            }if(count==2){
                count2++;
            }
        }

        System.out.println(count2);
    }
}
