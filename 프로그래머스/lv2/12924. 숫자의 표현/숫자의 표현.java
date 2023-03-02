class Solution {
    public int solution(int n) {
        int answer = 0;
    
        if(n<3){
            return 1;
        }
        for(int i=1;i<=n/2+1 ; i++){
            int result =0;
            for(int j=i ; j<=n/2+1 ; j++){
                result+=j;
                if(result==n){
                    answer++;
                    break;
                }else if(result>n){
                    break;
                }
            }
        }
        return answer+1;
    }
}