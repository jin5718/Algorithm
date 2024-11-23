import java.util.*;

class Solution{
    public int solution(String s){
        int answer = -1;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(stk.isEmpty()){
                stk.push(s.charAt(i));
            }else if(!stk.isEmpty() && stk.peek().equals(s.charAt(i))){
                stk.pop();
            }else{
                stk.push(s.charAt(i));
            }
        }
        System.out.println(stk);
        
        if(stk.isEmpty()){
            answer = 1;
        }else{
            answer = 0;
        }
        


        return answer;
    }
}