import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int count=0;
        String arr[]=s.split("");
        
        for(String ss:arr){
            count=ss.contains(" ")? 0: count+1;
            answer+= count%2==0?ss.toLowerCase():ss.toUpperCase();
        }
        
        return answer;
    }
}