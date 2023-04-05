import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack <Integer> st =new Stack<>();

        for(int i:arr){
            if(st.isEmpty()){
                st.push(i);
            }else{
                if(st.peek()==i){
                    st.pop();
                    st.push(i);
                }else{
                    st.push(i);
                }
            }
        }

        int answer[]=new int[st.size()];
        for(int i=0;i<st.size();i++){
            answer[i] = st.get(i).intValue();
        }
        
        return answer;
    }
}