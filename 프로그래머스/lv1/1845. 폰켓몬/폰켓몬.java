import java.util.*;
class Solution {
    public int solution(int[] nums) {
        
        ArrayList <Integer> alist =new ArrayList <Integer>();
        
         for(int i : nums){
                if(!alist.contains(i)){
                    alist.add(i);
                }
            }
        
        if(nums.length/2 <= alist.size()){
            return nums.length/2;
        }else{
            return alist.size();
        }

    }
}