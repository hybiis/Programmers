import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[]=s.split(" ");
        int intarr[]=new int[arr.length];
        int a=0;
        
        for(String i: arr){
            intarr[a++]=Integer.parseInt(i);
        }
        
        StringBuffer sb= new StringBuffer();      
        sb.append(Arrays.stream(intarr).min().getAsInt());
        sb.append(" ");
        sb.append(Arrays.stream(intarr).max().getAsInt());
        
        return sb.toString();
    }
}