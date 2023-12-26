import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String s : skill_trees){
            int cnt = 0;
            boolean tf = true;
            for(char c : s.toCharArray()){
                if(cnt == skill.indexOf(c)){
                    cnt++;
                }else if(skill.indexOf(c)==-1){
                    continue;
                }
                else{
                    tf = false;
                    break;
                }
            }
            
            if(tf == true){
                answer++;
            }
        }
        
        return answer;
    }
}