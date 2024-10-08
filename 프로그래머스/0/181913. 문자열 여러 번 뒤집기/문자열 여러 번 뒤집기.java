import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String[] mystr = new String[my_string.length()];
        for(int i = 0; i < queries.length; i++){
            
            // 바뀌는 구간
            String origin = my_string.substring(queries[i][0], queries[i][1] + 1);
            
            String reverse = new StringBuilder(origin).reverse().toString();

            my_string = my_string.substring(0, queries[i][0]) + reverse + my_string.substring(queries[i][1] + 1);
        }
        answer = my_string;
        return answer;
    }
}