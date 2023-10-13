import java.util.*;
class Solution {
    static class Node{    
        String next;
        int edge;
        
        public Node(String next, int edge){
            this.next = next;
            this.edge = edge;
        }
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer=0, n=words.length;
        boolean[] visited = new boolean[n];
        Queue <Node> que = new LinkedList<>();
        
        que.add(new Node(begin,0));
        
        while(!que.isEmpty()){
            Node cur = que.poll();
            
            if(cur.next.equals(target)){
                answer = cur.edge;
                break;
            }
            
            for(int i=0;i<n;i++){
                if(isNext(cur.next,words[i]) && !visited[i]){
                    visited[i] = true;
                    que.add(new Node(words[i], cur.edge+1));
                }
            }
        }
        
        return answer;
    }
    
    static boolean isNext(String cur, String next){
        int count = 0;
        
        for(int i=0;i<cur.length();i++){
            if(cur.charAt(i) != next.charAt(i)){
                if(++count>1) return false;
            }
        }
        return true;
    }
}