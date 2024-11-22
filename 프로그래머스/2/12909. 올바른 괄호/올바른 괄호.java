import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(s.charAt(i));
            }else if(!stk.isEmpty() && stk.peek() == '(' && s.charAt(i) == ')'){
                stk.pop();
            }else if(s.charAt(i) == ')'){
                stk.push(s.charAt(i));
            }
        }
        System.out.println(stk);
        if(!stk.isEmpty()){
            answer = false;
        }

        return answer;
    }
}