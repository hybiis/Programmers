class Solution {
    public String solution(String s) {
        String answer = "";
        
        String arr[] =s.toLowerCase().split("");
        boolean flag = true;
        
        for(String S : arr){
            answer+= flag? S.toUpperCase():S;
            flag=S.equals(" ")?true:false;
        }
        return answer;
    }
}  