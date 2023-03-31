class Solution {
    public String solution(String s, String skip, int index) {
        String answer="";

        String alpa ="abcdefghijklmnopqrstuvwxyz";
        String skiparr[] =skip.split("");

        for(int i=0;i< skip.length();i++){
            alpa =alpa.replaceAll(String.valueOf(skip.charAt(i)),"");
        }

        int num=0;

        for(int j=0;j<s.length();j++){
            num=index+alpa.indexOf(s.charAt(j));
            while(num>=alpa.length()){
                num=num-alpa.length();
            }
            answer+= String.valueOf(alpa.charAt(num));
            }        
        return answer;
    }
}