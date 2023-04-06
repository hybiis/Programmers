import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        String alpa[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<alpa.length;i++){
            s=s.replaceAll(alpa[i],String.valueOf(i));
        }
        answer=Integer.parseInt(s);
        return answer;
    }
}