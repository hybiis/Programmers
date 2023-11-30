import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        char[] result = new char[number.length() - k];
        Stack <Character> s = new Stack<>();
        
        for(int i=0;i<number.length();i++){
            char c = number.charAt(i);
            while(!s.isEmpty() && s.peek()<c && k-- >0){
                s.pop();
            }
            s.push(c);
        }
        
         
        for (int i=0; i<result.length; i++) {
            result[i] = s.get(i);
        }
        return new String(result);
    }
}