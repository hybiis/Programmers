import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		double arr[]=new double[a];

        for(int i=0;i<a;i++){
            arr[i]=sc.nextDouble();
        }
        Arrays.sort(arr);
        double max=arr[a-1];

        for(int i=0;i<a;i++){
            arr[i]=arr[i]/max*100;
        }
        double sum=0;

        for(double i:arr){
            sum+=i;
        }
		System.out.println(sum/a);
	}
}
