import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        boolean flag = true;
        String arr[] = s.toLowerCase().split("");
        
        for(String ss: arr){
            answer+= flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false ;
        }
        return answer;
    }
} 