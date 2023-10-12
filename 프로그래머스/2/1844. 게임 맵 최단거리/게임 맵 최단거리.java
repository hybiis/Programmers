import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        int rows = maps.length;
        int cols = maps[0].length;
        
        Queue <int[]> que = new LinkedList<>();
        que.offer(new int[]{0,0,1});
        
        int distances [][] = {{-1,0},{1,0},{0,1},{0,-1}};
        
        while(!que.isEmpty()){
            int[] current = que.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];
            
            if(rows-1 == row && cols-1 == col){
                return distance;
            }
            
            for(int[] dis:distances){
                int newrow = row+dis[0];
                int newcol = col+dis[1];
                
                if(newrow>=0 && newrow<rows && newcol>=0 && newcol<cols && maps[newrow][newcol]==1){
                    maps[newrow][newcol]=0;
                    que.offer(new int[]{newrow,newcol,distance+1});
                }
            }
        }
        return -1;
    }
}