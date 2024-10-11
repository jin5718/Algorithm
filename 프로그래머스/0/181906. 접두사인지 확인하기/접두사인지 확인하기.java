import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
            for(int j = 1; j < my_string.length() + 1; j++){
                arr.add(my_string.substring(0, j));
            }
        if(arr.contains(is_prefix)){
            answer = 1;
        }
        return answer;
    }
}