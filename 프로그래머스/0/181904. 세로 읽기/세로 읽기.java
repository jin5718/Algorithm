import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int l = my_string.length();
        int n = c-1;
        while(n < l){
            answer += my_string.charAt(n);
            n += m;
        }
        
        return answer;
    }
}