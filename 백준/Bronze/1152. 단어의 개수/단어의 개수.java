 
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String s=sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");

        // countTokens() 는 토큰의 개수를 반환한다
        System.out.println(st.countTokens());
    }
}
