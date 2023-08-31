import java.util.*;
class Solution {
    public int solution(int[][] maps) {  
        int rows = maps.length;
        int cols = maps[0].length;
        int[][] move ={{-1,0}, {1,0}, {0,-1}, {0,1}};
        boolean check [][] = new boolean[maps.length][maps[0].length];
        
        Queue <int[]> que = new LinkedList<>();

        
        que.offer(new int[]{0,0,1});
        
        while(!que.isEmpty()){
            int [] road = que.poll();
            int row = road[0];
            int col =road[1];
            int distance = road[2];
            
            if(row == rows-1 && col == cols-1){
                return distance;
            }
            
            for(int [] i : move){
                int newrow = row + i[0];
                int newcol = col + i[1];
                if(newrow>=0 && newrow<rows && newcol>=0 && newcol<cols &&maps[newrow][newcol] == 1 ){
                    maps[newrow][newcol] =0;
                    que.offer(new int[]{newrow,newcol,distance+1});
                }
            }
        }
        
        return -1;
        
    }
}