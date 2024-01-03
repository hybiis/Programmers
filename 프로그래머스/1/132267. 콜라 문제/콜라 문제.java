import java.util.*;
class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n>1){            
            answer += (n/a)*b;
            n = (n/a)*b + n%a;
            if((n/a)*b==0) break;
        }
        
        return answer;
    }
}