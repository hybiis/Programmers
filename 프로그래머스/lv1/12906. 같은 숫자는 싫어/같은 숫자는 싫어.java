import java.util.*;

public class Solution {
    public int[] solution(int []arr) {

        Stack <Integer> s = new Stack<>();
        
        for(int i: arr){
            if(s.empty()){
                s.push(i);
            }else if(s.peek()==i){
                continue;
            }else{
                s.push(i);
            }
        }
        
        int answer[]= new int[s.size()];
        int index = s.size() - 1;

        while (!s.empty()) {
            answer[index--] = s.pop();
        }

        return answer;
    }
}