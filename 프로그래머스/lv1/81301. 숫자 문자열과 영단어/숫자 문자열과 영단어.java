class Solution {
    public int solution(String s) {
        String A []={"zero", "one", "two", "three" ,"four", "five" ,"six", "seven", "eight", "nine"};
         String num []={"0", "1", "2", "3" ,"4", "5" ,"6", "7", "8", "9"};
        
        for(int i=0;i<10;i++){
            s=s.replaceAll(A[i],num[i]);
        }
        
        return Integer.parseInt(s);
    }
}