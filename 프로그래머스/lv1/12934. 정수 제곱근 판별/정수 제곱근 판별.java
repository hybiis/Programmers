import java.util.*;
class Solution {
    public long solution(long n) {       
        double result=Math.sqrt(n);
        double a=Math.pow((result+1),2);
        double k=Math.floor(result);
        double b=result/k;
        if(b==1.0){
            return (long)(a);
        }else{
            return -1;
        }
       
    }
}