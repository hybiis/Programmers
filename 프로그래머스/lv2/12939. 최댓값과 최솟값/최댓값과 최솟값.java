import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String arr[] =s.split(" ");
        int intarr[]=new int[arr.length];
        int a=0;
        
        for(String i : arr){
            intarr[a++]=Integer.parseInt(i);
        }
        
        Arrays.sort(intarr);
        
        answer=Integer.toString(intarr[0])+" "+Integer.toString(intarr[intarr.length-1]);
        return answer;
    }
}