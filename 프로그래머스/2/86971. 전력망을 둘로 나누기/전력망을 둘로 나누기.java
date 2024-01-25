import java.util.*;
class Solution {
    public ArrayList<Integer>[] graph ;
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        graph = new ArrayList[n+1];
        for(int i=1;i<=n;i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<wires.length;i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            graph[v1].add(v2);
            graph[v2].add(v1);
        }
        
        for(int i=0; i<wires.length;i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            
            graph[v1].remove(Integer.valueOf(v2));
            graph[v2].remove(Integer.valueOf(v1));
            
            boolean visited [] = new boolean [n+1];
            
            int cnt = dfs(1,visited);
            
            answer = Math.min(Math.abs(cnt-(n-cnt)),answer);
            
            graph[v1].add(v2);
            graph[v2].add(v1);
                       
            
        }
        
        
        return answer;
    }
    public int dfs(int v, boolean[] visited){
        visited[v] = true;
        int cnt = 1;
        
        for(int i : graph[v]){
            if(!visited[i]){
                cnt += dfs(i,visited);
            }
        }
        return cnt;
    }
}