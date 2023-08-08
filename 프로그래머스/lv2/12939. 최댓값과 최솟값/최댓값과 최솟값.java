import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String arr[] = s.split(" ");
        int intarr[] = new int [arr.length];
        for( int i=0;i<arr.length;i++){
                       
            intarr[i]=Integer.valueOf(arr[i]);
                 
        }
        
        Arrays.sort(intarr);
        
        answer = String.valueOf(intarr[0])+" "+String.valueOf(intarr[arr.length-1]);
        
        return answer;
    }
}