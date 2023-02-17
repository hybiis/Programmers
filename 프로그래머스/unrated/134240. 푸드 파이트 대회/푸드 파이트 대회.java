import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
    
        for(int i=1;i<food.length;i++)
            if(food[i]>1)
                for(int j=0;j<food[i]/2;j++)
                    answer+=Integer.toString(i);
        
        StringBuffer sb = new StringBuffer(answer);
        String str = answer+"0"+sb.reverse().toString();
      
        return str;
    }
}