import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        
        if(Arrays.asList(words).indexOf(target)==-1){
            return 0;
        }
        
        int l = begin.length();
        for(int i=0;i<words.length;i++){
            int cnt = 0;
            int rcnt=0;
            for(int j=0;j<l;j++){
                if(begin.charAt(j)==words[i].charAt(j)){
                    cnt++;
                }
                if(begin.charAt(j)==target.charAt(j)){
                    rcnt++;
                }
            }
            if(rcnt == l-1){
                answer++;
                break;
            }
            if(cnt== l-1){
                answer++;
                begin = words[i];
            }
            
            
        }
        
        return answer;
    }
}