import java.util.*;
class Solution {
    class Node{
        String s;
        int edge;
        public Node(String s,int edge){
            this.s = s;
            this.edge = edge;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean chk[] = new boolean[words.length];
        
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(begin,0));
        
        while(!que.isEmpty()){
            Node cur = que.poll();
            
            if(cur.s.equals(target)){
                answer= cur.edge;
                return answer;
            }            
            for(int i=0;i<words.length;i++){
                if(wordchk(cur.s,words[i]) && chk[i]==false){
                    chk[i]=true;
                    que.add(new Node(words[i],cur.edge+1));
                }
            }            
            
        }
        
        return answer;
    }
                
    public boolean wordchk(String s1, String s2){
        int num =0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                num++;
                if(num>1){
                    return false;
                }
            }
        }
        return true;
    }
}