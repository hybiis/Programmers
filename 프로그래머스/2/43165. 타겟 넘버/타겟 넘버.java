import java.util.*;
class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {            
        dfs(numbers,target,0,0);
        return answer;
    }
    public void dfs(int[] num,int target,int result,int index){
        if(index==num.length){  
            if(result==target){
                answer++;
            }
        }else{
            dfs(num,target,result+num[index],index+1);
            dfs(num,target,result-num[index],index+1);
        }        
    }
}