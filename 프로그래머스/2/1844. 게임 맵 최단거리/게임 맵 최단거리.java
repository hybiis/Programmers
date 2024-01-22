import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = -1;
        int xy[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        
        Queue <int[]> que = new LinkedList<>();
        
        if(que.isEmpty()){
            que.add(new int[]{0,0,1});
        }
        
        while(!que.isEmpty()){
            int n[] = que.poll();
            int x = n[0];
            int y = n[1];
            int distance = n[2];
            
            if(x==maps.length-1 && y==maps[0].length-1){
                return distance;
            }
            
            for(int i=0;i<4;i++){
                int newx = x+xy[i][0];
                int newy = y+xy[i][1];
                
                if(newx>=0 && newy>=0 && newx<maps.length && newy<maps[0].length &&maps[newx][newy]==1){
                    maps[newx][newy]=0;
                    que.add(new int[]{newx,newy,distance+1});
                }
            }            
        }
        return answer;
    }
}