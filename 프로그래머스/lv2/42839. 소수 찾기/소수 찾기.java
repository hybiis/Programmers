import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
         
        HashSet<Integer> set =new HashSet<>();
        
        allnumbers("",numbers,set);
        
        while(set.iterator().hasNext()){
            int n = set.iterator().next();
            set.remove(n);
            if(is_prime(n)){
                answer++;
            }
  
        }
        return answer;
    }
    
    //소수찾기
    public boolean is_prime(int n){
        if(n == 0 || n ==1) return false;
        for(int i=2; i*i<=n;i++){
            if(n%i==0) return false; 
        }  
        return true;
    }
    
    //중복없는 String 속 수 모두 찾기
    public void allnumbers(String pre,String str, HashSet<Integer> set){
        int n = str.length();
 
        if(!pre.equals("")){
            set.add(Integer.valueOf(pre));
        }
        
        for(int i=0; i<n; i++){
            allnumbers(pre+str.charAt(i), str.substring(0,i)+str.substring(i+1,n),set);
        }
    }
}