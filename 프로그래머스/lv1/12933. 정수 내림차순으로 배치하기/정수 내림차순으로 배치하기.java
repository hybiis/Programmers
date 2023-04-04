import java.util.*;
class Solution {
    public long solution(long n) {
        long answer=0;
        String s= ""+n;
        String arr[]=s.split("");
        
        Arrays.sort(arr);
        s="";
        for(int i=arr.length-1;i>=0;i--){
            
            s+=arr[i];
        }
        answer=Long.parseLong(s);
        
        return answer;
    }
}