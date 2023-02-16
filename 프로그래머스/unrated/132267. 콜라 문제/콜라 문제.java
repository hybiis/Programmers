class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>=a)
            if(n%a==0){
                n=n/a*b;
                answer+=n;
            }else{
                for(int i=1;i<a;i++){
                    if((n-i)%a==0){
                        n=(n-i)/a*b;
                        answer+=n;
                        n=n+i;
                    }
                }
            }   
        
        return answer;
    }
}