import java.util.*;

class Solution {
    public int[] solution(long n) {
        String num = String.valueOf(n);
        int[] answer = new int[num.length()];
        int j = 0;
        for(int i = num.length()-1; i >= 0; i--){
            answer[j] = Integer.parseInt(String.valueOf(num.charAt(i)));
            j++;
        }
        return answer;
    }
}