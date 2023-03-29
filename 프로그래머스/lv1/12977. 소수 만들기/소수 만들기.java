import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer=0;

        ArrayList<Integer> alist =new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    alist.add(nums[i]+nums[j]+nums[k]);                   
                }
            }
        }
              
        for(int i: alist){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                answer++;
            }
        }
        return answer;
    }
}