import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int [prices.length];
        Arrays.fill(answer,0);
        
        Stack <Integer> s =new Stack <>();
        s.push(0);
        
        for(int i=1; i<prices.length;i++){
            int index=s.pop();
            while(i<prices.length){
                if(prices[i]>=prices[index]){
                    answer[index]++;
                    i++;
                }else{
                    answer[index]++;
                    i++;
                    break;
                }
            }
            i=index+1;
            s.push(i);
        }
        return answer;
    }
}