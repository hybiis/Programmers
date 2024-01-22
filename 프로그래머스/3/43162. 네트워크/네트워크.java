class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] chk = new boolean[n];
        for(int i=0;i<n;i++){
            if(chk[i]==false){
                dfs(i,chk,computers);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int i, boolean[] chk, int[][] computers){
        chk[i]=true;
        
        for(int j=0;j<computers.length;j++){
            if(i!=j && computers[i][j]==1 && chk[j]==false){
                dfs(j,chk,computers);
            }
        }
    }
}