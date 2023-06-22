import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int topIndex = stack.pop();
                answer[topIndex] = i - topIndex;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int topIndex = stack.pop();
            answer[topIndex] = prices.length - topIndex - 1;
        }

        return answer;
    }
}