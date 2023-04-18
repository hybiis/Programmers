class Solution {
    public String solution(String s) {
        String answer = "";
        boolean A=true;
        
        s=s.toLowerCase();
        String arr[]=s.split("");
        
        for(String ss:arr){
            answer+= A?ss.toUpperCase():ss;
            A=ss.equals(" ")?true:false;
        }
        return answer;
    }
}