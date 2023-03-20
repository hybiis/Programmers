import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result=a*b*c;

        String re=Integer.toString(result);
        String arr[]=re.split("");



        for(int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(i==Integer.parseInt(arr[j])){
                    count++;
                }
            }
            System.out.println(count);
        }


	}
}
