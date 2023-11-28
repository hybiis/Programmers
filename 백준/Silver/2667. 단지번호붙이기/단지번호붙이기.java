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
        n = sc.nextInt();
        map = new int[n][n];
        check = new boolean[n][n];
        apartArr = new int[n*n];
        for(int i=0;i<n;i++){
            String input = sc.next();
            for(int j=0;j<n;j++){
                map[i][j] = input.charAt(j)-'0';
            }
        }

         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 if(map[i][j]==1 && check[i][j]==false){
                     count++;
                     dfs(i,j);
                 }
             }
         }
         System.out.println(count);
         Arrays.sort(apartArr);
         for(int i:apartArr){
             if(i!=0) {
                 System.out.println(i);
             }
         }

        sc.close();
    }

    public static void dfs(int x, int y){

        check[x][y] = true;
        apartArr[count]++;

        for(int i=0;i<4;i++){
            int newX = x+xd[i];
            int newY = y+yd[i];

            for(int j=0;j<n;j++){
                if(newX>=0 && newY>=0 && newX<n && newY<n && map[newX][newY] == 1 &&check[newX][newY]==false){
                    dfs(newX,newY);
                }
            }
        }

    }
}