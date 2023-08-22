class Solution {
    
    int answer = 0;
    
    public int solution(int[] numbers, int target) {
     
        dfs(numbers,0,0,target);
        
        return answer;
    }
    public int dfs(int[] numbers, int depth, int sum, int target){
        
        if(depth==numbers.length){
            if(sum==target){
                answer++;
            }
        }else{
            dfs(numbers, depth+1, sum+numbers[depth],target);
            dfs(numbers, depth+1, sum-numbers[depth],target);
        }
        
        return answer;
    }
}