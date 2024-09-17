import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        ArrayList<String> num = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            num.add(String.valueOf(i));
        }
        
        if(s.length() == 4 || s.length() == 6){
            answer = true;
        }else{
            answer = false;
        }
        for(int i = 0; i < s.length(); i++){
            if(num.contains(String.valueOf(s.charAt(i)))){
                continue;
            }else{
                answer = false;
                break;
            }
        }
        return answer;
    }
}