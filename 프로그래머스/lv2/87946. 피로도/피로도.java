class Solution {
    int answer = 0;
    
    public int solution(int k, int[][] dungeons) {  
        boolean check [] = new boolean [dungeons.length];
        
        dfs(dungeons,k,check,0);
        
        return answer;
    }
    
    public void dfs(int[][] dungeons, int num, boolean[] check,int count){
     
        for(int i=0; i<dungeons.length;i++){
            if(!check[i] && dungeons[i][0]<=num ){
                check[i]=true;
                dfs(dungeons,num-dungeons[i][1],check,count+1);
                check[i]=false;
            }
        }
        answer = Math.max(answer,count);

    }
}