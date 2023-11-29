import java.util.*;
class Solution {
    class Node{
        String start;
        int edge;
        public Node(String start,int edge){
            this.start = start;
            this.edge = edge;
        }
    }
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        Queue<Node> que = new LinkedList<>();
        boolean visited[] = new boolean [words.length];
        
        que.add(new Node(begin,0));
        
        while(!que.isEmpty()){
            Node cur = que.poll();
            
            if(cur.start.equals(target)){
                return cur.edge;
            }
            
            for(int i=0;i<words.length;i++){
                if(visited[i] ==false && check(cur.start,words[i])){
                    visited[i]=true;
                    que.add(new Node(words[i],cur.edge+1));
                }
            }
        } 
        
        return answer;
    }
    public boolean check(String s, String compare){
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=compare.charAt(i)){
                count++;
            }
            if(count>1) return false;
        }
        return true;
    }
}