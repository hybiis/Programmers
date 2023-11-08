import java.util.*;
class Solution {
    ArrayList<String> list = new ArrayList<>();
    public int solution(String word) {
        int answer = 0;
        
        dfs("",0);
        
        return list.indexOf(word);
    }
    
    public void dfs(String str, int len){
        if(len>5) return;
        list.add(str);
        for(int i=0;i<5;i++){
            dfs(str+"AEIOU".charAt(i), len+1);
        }
    }
}