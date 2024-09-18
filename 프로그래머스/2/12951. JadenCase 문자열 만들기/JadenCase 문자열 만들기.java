import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder(s);
        
        if(s.charAt(0) == ' '){
            sb.setCharAt(1, Character.toLowerCase(s.charAt(1)));
        }
        if(s.length() == 1 && Character.isLowerCase(s.charAt(0))){
            sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));

        }
        for(int i = 1; i < s.length(); i++){
            
            
            if(Character.isLetter(s.charAt(0)) && Character.isLowerCase(s.charAt(0))){
                sb.setCharAt(0, Character.toUpperCase(s.charAt(0)));
            }
            
            if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i - 1) == ' '){
                    if(Character.isLowerCase(s.charAt(i))){
                        sb.setCharAt(i, Character.toUpperCase(s.charAt(i)));
                    }
                }else{
                    if(Character.isUpperCase(s.charAt(i))){
                        sb.setCharAt(i, Character.toLowerCase(s.charAt(i)));
                    }
                }
            }
        }
        answer = sb.toString();
        return answer;
    }
}