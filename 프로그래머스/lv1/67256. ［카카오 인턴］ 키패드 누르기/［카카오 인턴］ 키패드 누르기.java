class Solution {
    
    int keyboard[][]={
            {3,1}, //0
            {0,0}, //1
            {0,1}, //2
            {0,2}, //3
            {1,0}, //4
            {1,1}, //5
            {1,2}, //6
            {2,0}, //7
            {2,1}, //8
            {2,2}  //9
    };
    
    int [] left = {3,0};
    int [] right = {3,2};
    String hand;
    public String solution(int[] numbers, String hand) {
        this.hand = hand.equals("left")? "L":"R";
        
        String answer = "";
        
        for(int num: numbers){
            String umji = putkeyboard(num);
            answer+=umji;
            
            if(umji.equals("L")) left=keyboard[num];
            if(umji.equals("R")) right=keyboard[num];
        }
        return answer;
    }
    
    private String putkeyboard(int num){
        if(num==1 ||num==4 || num==7) return "L";
        if(num== 3||num==6 || num==9) return "R";
        
        if(compare(left,num)> compare(right,num)) return "R";
        if(compare(left,num)< compare(right,num)) return "L";

        return hand;
    }
    
    private int compare(int[] board, int num){
        return Math.abs(board[0]-keyboard[num][0])+Math.abs(board[1]-keyboard[num][1]);
    }
}