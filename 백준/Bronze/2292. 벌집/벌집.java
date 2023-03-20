import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        if(a==1){
            System.out.println(1);
        }
        int sum=2;
        for(int i=1;i<a;i++){
            sum+=6*i;
            if(a<sum){
                System.out.println(i+1);
                break;
            }
        }


    }
}
