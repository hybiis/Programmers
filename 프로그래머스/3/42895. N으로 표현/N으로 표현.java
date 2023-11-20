import java.util.*;
class Solution {
    public int solution(int N, int number) {
        int answer = -1;
        Set<Integer>[] set = new Set[9];
        
        int t = N;
        
        for(int i=1;i<9;i++){
            set[i] = new HashSet<>();
            set[i].add(t);
            t = t*10+N;
        }
        
        for(int i=1;i<9;i++){
            for(int j=1;j<i;j++){
                for(int a: set[j]){
                    for(int b: set[i-j]){
                        set[i].add(a+b);
                        set[i].add(a-b);
                        set[i].add(a*b);
                        if(a!=0)
                            set[i].add(b/a);
                        
                    }
                }
            }
        }
        
        for(int i=1;i<9;i++){
            if(set[i].contains(number)){
                return i;
            }
        }
        
        return answer;
    }
}