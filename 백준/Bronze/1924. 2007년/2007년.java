import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        int m = in.nextInt();
		int d = in.nextInt();

		String days[]={"MON", "TUE", "WED", "THU", "FRI", "SAT","SUN"};
		int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

		int n=0;
		for(int i=0;i<m;i++){
			n+=month[i];
		}

		n+=d-1;
		System.out.println(days[n%7]);
	}
}

