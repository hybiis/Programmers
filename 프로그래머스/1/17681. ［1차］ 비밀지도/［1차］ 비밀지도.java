import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0;i<n;i++){
            String s = Integer.toBinaryString(arr1[i] | arr2[i]);
            while (s.length() < n) {
                s = "0" + s;
            }
            answer[i] = s;
            answer[i] = answer[i].replaceAll("1","#");
            answer[i] = answer[i].replaceAll("0"," ");
        }
        return answer;
    }
}