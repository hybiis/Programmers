import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;       
        int len = nums.length/2;
        
        Set <Integer> set = new HashSet<>();
        
        for(int i:nums){
            set.add(i);
        }
        
        if(set.size()<=len){
            answer= set.size();
        }else{
            answer = len;
        }
        
        return answer;
    }
}