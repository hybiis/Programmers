import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int xy [][] = {{-1,0},{1,0},{0,-1},{0,1}};
        int start [] = {0,0};
        
        Queue <int []> que = new LinkedList<>();
        que.add(new int[] {0,0,1});
        
        while(!que.isEmpty()){
            int arr[] = que.poll();
            int x = arr[0];
            int y = arr[1];
            int dis = arr[2];
            
            if(x==maps.length-1 && y==maps[0].length-1){
                return dis;
            }
            
            for(int i=0;i<4;i++){
                int newx = x + xy[i][0];
                int newy = y + xy[i][1];
                
                if(newx>=0 && newy>=0 && newx<maps.length && newy<maps[0].length && maps[newx][newy]==1){
                    maps[newx][newy] = 0;
                    que.add(new int[]{newx,newy,dis+1});
                }
            }
            
        }
        
        return -1;
    }

}