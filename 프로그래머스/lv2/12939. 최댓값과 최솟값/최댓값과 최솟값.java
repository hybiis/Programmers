import java.util.*;

class Solution {
    public String solution(String s) {
        
        
        String arr[] = s.split(" ");
        int intarr[] = new int [arr.length];
        for( int i=0;i<arr.length;i++){
                       
            intarr[i]=Integer.valueOf(arr[i]);
                 
        }
        
        Arrays.sort(intarr);
        
        return intarr[0]+" "+intarr[arr.length-1];
    }
}