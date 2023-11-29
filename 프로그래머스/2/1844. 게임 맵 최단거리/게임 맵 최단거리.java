import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int n = maps.length;
        int m = maps[0].length;
        int dis[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> que = new LinkedList<>();
        
        que.add(new int[]{0,0,1});
        
        while(!que.isEmpty()){
            int[] arr = que.poll();
            int row = arr[0];
            int col = arr[1];
            int distance = arr[2];
            
            if(row == n-1 && col == m-1){
                return distance;
            }
            
            for(int i=0;i<4;i++){
                int newRow = row + dis[i][0];
                int newCol = col + dis[i][1];
                
                if(newRow>=0 && newCol>=0 && newRow<n && newCol<m && maps[newRow][newCol] == 1){
                    maps[newRow][newCol] = 0;
                    que.add(new int[]{newRow,newCol,distance+1});
                }
            }
        
        }
        
        return answer;
    }
}