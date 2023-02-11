class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int k=x;
        int sum=0;
        while(true){
            sum+=x%10;
            if(x<1){
                break;
            }
            x=x/10;
        }     
        if(k%sum==0){
            return answer;
        }else{
            return false;
        }        
    }
}