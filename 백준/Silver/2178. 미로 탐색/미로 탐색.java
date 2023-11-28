import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // row
        int M = sc.nextInt(); // col
        sc.nextLine(); // 정수 입력 후 남은 개행 문자 처리

        int newArr[][] = new int[N][M];

        for(int i = 0; i < N; i++) {
            String line = sc.nextLine();
            for(int j = 0; j < M; j++) {
                newArr[i][j] = line.charAt(j) - '0';
            }
        }

        Queue<int[]> que = new LinkedList<>();
        int dis[][] = {{0,1},{0,-1},{1,0},{-1,0}}; //좌우위아래 좌표
        que.add(new int[]{0,0,1});

        while(!que.isEmpty()){
            int num[] = que.poll();
            int rows = num[0];
            int cols = num[1];
            int distance = num[2];

            if(N-1 == rows && M-1 == cols){
                System.out.println(distance);
            }

            for(int[] i: dis){
                int newRow = rows + i[0];
                int newCol = cols + i[1];

                if(newRow>=0 && newCol>=0 && newRow <N && newCol <M && newArr[newRow][newCol] == 1){
                    newArr[newRow][newCol] = 0;
                    que.add(new int[]{newRow,newCol,distance+1});
                }
            }
        }

        sc.close();
    }

}