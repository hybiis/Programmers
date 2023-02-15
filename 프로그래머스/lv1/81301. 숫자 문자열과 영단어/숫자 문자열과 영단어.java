import java.util.*;
class Solution {
    public int solution(String s) {
        String answer = "";
        String num []={"zero", "one", "two", "three" ,"four", "five" ,"six", "seven", "eight", "nine"};
      String[] str=s.split("");
      String n="";
        
      for(int i=0;i<s.length();i++){
          n+=str[i];
          char ch=n.charAt(0);
          for(int j=0;j<num.length;j++){
            if(n.equals(num[j])  ){
              n=Integer.toString(j);
              answer+=n;
              n="";
            }else if(ch > 47 && ch<=57){
              answer+=s.charAt(i);
              n="";
              break;
            }
          }
      }
        return Integer.parseInt(answer);
    }
}