import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer=0;
        ArrayList<Integer> alist =new ArrayList<Integer>();
        for(int i=0;i<10;i++){
            alist.add(i);
        }
        for(int i=0;i<numbers.length;i++){
            alist.remove(Integer.valueOf(numbers[i]));
        }
        for (int num: alist) {
            answer+=num;
        }
        return answer;
    }
}