import java.util.*;
public class Main {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();

        if(b>=45){
            System.out.printf("%d %d\n",a,b-45);

        }else{
            a=a-1;
            b=60-(45-b);

            if(a<0){
                a=23;
            }
            System.out.printf("%d %d\n",a,b);
        }
    }
}

