class Solution {
    public String solution(int n) {
        String answer = "";
        String answer2="";

        for(int i=0;i<n/2;i++){
            answer+="수박";
        }
        if(n%2==1){
            return answer+"수";
        }
        return answer;
    }
}