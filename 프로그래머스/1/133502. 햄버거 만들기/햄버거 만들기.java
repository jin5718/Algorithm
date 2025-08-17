import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < ingredient.length; i++){
            stk.push(ingredient[i]);
            int j = stk.size() - 1;
                        
            if(j < 3){
                continue;
            }
            
            if(stk.get(j) == 1 && stk.get(j-1) == 3 && stk.get(j-2) == 2 && stk.get(j-3) == 1){
                stk.pop();
                stk.pop();
                stk.pop();
                stk.pop();
                answer += 1;
            }

        }
        return answer;
    }
}