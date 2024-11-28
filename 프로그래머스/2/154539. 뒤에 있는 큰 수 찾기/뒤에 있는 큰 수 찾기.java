import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            answer[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            while (!stk.isEmpty() && numbers[stk.peek()] < numbers[i]) {
                int index = stk.pop();
                answer[index] = numbers[i];
            }
            stk.push(i);
        }

        return answer;
    }
}
