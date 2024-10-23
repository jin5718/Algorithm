import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < names.length; i +=5){
            arr.add(names[i]);
        }
        answer = arr.toArray(new String[0]);
        return answer;
    }
}