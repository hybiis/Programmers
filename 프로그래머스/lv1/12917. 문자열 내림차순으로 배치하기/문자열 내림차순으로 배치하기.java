import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder bp=new StringBuilder();
        String arr[]=s.split("");
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(int i=0;i<arr.length;i++){
            bp.append(arr[i]);
        }
        answer=bp.toString();
        
        
        return answer;
    }
}