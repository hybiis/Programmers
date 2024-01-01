import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String num [] = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            num[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(num,new Comparator<String>(){
            public int compare(String s1, String s2){
                return (s2+s1).compareTo(s1+s2);
            }
        });    

        for(String s:num){
            answer+= s;
        }
        
        if(answer.charAt(0)=='0') return "0";
        return answer;
    }
}