import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < s.length(); i ++){
            arr.add((int)s.charAt(i));
        }
        Collections.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.size(); i ++){
            answer += Character.toString(arr.get(i));
        }
        return answer;
    }
}