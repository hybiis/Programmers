import java.util.*;
class Solution {
    public String solution(String s) {
        String answer="";
        String str[] =s.split("");
        int l=str.length;
        
        for(int i=0;i<l;i++){
            if(l%2==0){
                answer=str[l/2-1]+str[l/2];
            }else{
                answer=str[l/2];
            }
        }
        return answer;
    }
}