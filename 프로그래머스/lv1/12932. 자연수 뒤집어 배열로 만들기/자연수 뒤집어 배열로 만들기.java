import java.util.*;
class Solution {
    public int[] solution(long n) {
        String a=""+n;
        int answer[]=new int[a.length()];
        int c=0;
        
        while(n>0){
            answer[c++]=(int)(n%10);
            n/=10;
        }
        
        return answer;
    }
}