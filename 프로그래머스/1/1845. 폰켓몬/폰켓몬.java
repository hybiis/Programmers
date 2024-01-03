import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        for(int i:nums){
            set.add(i);
        }
        
        int k = nums.length/2;
        if(k>set.size()){
            return set.size();
        }else{
            answer = k;
        }
        return answer;
    }
}