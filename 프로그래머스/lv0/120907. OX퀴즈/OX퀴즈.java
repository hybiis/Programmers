import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String [] answer = new String[quiz.length];

         for(int i=0;i<quiz.length;i++){
            int result=0;
            String arr[]=quiz[i].split(" ");
            result= Integer.parseInt(arr[0])+Integer.parseInt(arr[2])*(arr[1].equals("+")?1:-1);
             
            answer[i]=result==Integer.parseInt(arr[4])?"O":"X";

        }
        return answer;
    }
}