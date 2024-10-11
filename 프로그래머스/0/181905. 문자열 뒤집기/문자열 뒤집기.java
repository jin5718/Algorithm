import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i = s; i < e + 1; i++){
            sb.append(my_string.charAt(i));
        }
        sb = sb.reverse();
        System.out.println(sb);
        answer = my_string.substring(0, s) + sb + my_string.substring(e+1);
        return answer;
    }
}