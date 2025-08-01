import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String txt = "";
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                txt = txt + s.charAt(i);
            }else{
                for(int j = 0; j < txt.length(); j++){
                    if(j % 2 == 0){
                        answer = answer + Character.toUpperCase(txt.charAt(j));
                    }else{
                        answer = answer + Character.toLowerCase(txt.charAt(j));
                    }
                }
                answer = answer + ' ';
                txt = "";
            }
        }
                        for(int j = 0; j < txt.length(); j++){
                    if(j % 2 == 0){
                        answer = answer + Character.toUpperCase(txt.charAt(j));
                    }else{
                        answer = answer + Character.toLowerCase(txt.charAt(j));
                    }
                }
        return answer;
    }
}