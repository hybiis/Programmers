class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int result, int depth){
        if(numbers.length == depth){
            if(target==result) answer++;
        }else{
            dfs(numbers, target, result+numbers[depth], depth+1);
            dfs(numbers, target, result-numbers[depth], depth+1);
        }
    }
}