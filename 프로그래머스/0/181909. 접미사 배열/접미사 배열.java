import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            arr.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(arr);
        answer = arr.stream().toArray(String[]:: new);
        return answer;
    }
}