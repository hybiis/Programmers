class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!chk[i]){
                dfs(n, computers, chk, i);
                answer++;
            }
        }
        return answer;
    }
    
    void dfs(int n, int[][] computers, boolean[] chk, int num){
        chk[num]=true;
        
        for(int i=0;i<n;i++){
            if(!chk[i] && computers[num][i]==1){
                dfs(n, computers, chk, i);
            }
        }
    }
}