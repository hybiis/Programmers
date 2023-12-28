import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(ch >= 'a' && ch <='z'){
                ch = (char)((s.charAt(i) - 'a'+n) %26 + 'a');
            }else if(ch >= 'A' && ch <='Z'){
                ch = (char)((s.charAt(i) - 'A'+n) %26 + 'A');
            }
            
            answer += ch;
             
            
        }
         
        return answer;
    }
}