import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        ArrayList<Integer> sparr = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            sparr.add(Integer.parseInt(arr[i]));
        }        
        
        String answer = Collections.min(sparr) + " " + Collections.max(sparr);

        
        return answer;
    }
}