import java.util.*;
class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes,(a1,a2) -> a1[1]-a2[1]);
        int min = Integer.MIN_VALUE;
        
        for(int arr[] : routes){
            if(min<arr[0]){
                min = arr[1];
                answer++;
            }
        }
        
        return answer;
    }
}