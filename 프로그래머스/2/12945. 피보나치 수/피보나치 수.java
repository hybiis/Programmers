import java.util.*;
class Solution {
    long dp[];
    public long fibo(int n){      
        if(n==0) return 0;
        if(n==1) return 1;
        
        if(dp[n]!=0) return dp[n];
        
        dp[n] = (fibo(n-1)+fibo(n-2))%1234567;
        
        return dp[n];
    }
    
    public int solution(int n) {
        dp = new long[n+1];     
        return (int)fibo(n);
    }  
}