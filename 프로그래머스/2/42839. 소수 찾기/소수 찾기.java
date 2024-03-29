import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        permutation("",numbers,set);
        
        int count = 0;
        
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)) count++;
        }
        
        return count;
    }
    
    public boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i=3; i<= (int)Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    
    public void permutation(String s, String str, HashSet<Integer> set){
        int n = str.length();
        if(!s.equals("")) set.add(Integer.valueOf(s));
        for(int i=0;i<n;i++){
            permutation(s+str.charAt(i),str.substring(0,i)+str.substring(i+1,n),set);
        }
    }
}