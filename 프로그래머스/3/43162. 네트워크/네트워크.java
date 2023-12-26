import java.util.*;
class Solution {
    boolean check[];
    public int solution(int n, int[][] computers) {
        int answer = 0;
        check = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!check[i]){
                dfs(n,computers,i);
                answer++;
            } 
        }
        
        return answer;
    }
    public void dfs(int n, int[][]computers,int k){
        check[k] = true;
        for(int i=0;i<n;i++){
            if(!check[i] && computers[k][i]==1){
                dfs(n,computers,i);
            }
        }
    }
}