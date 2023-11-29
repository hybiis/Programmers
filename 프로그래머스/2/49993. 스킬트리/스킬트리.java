class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String s : skill_trees){
            String str = s.replaceAll("[^"+skill+"]","");
            
            if(str.equals("")){
                answer++;
            }
            for(int i =1; i<=skill.length();i++){
                if(skill.substring(0,i).equals(str)){
                    answer++;
                }
            }
        }
        return answer;
    }
}