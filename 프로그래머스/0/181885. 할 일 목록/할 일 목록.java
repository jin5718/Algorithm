import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            if(finished[i] == false){
                arr.add(todo_list[i]);
            }
        }
        answer = arr.toArray(new String[0]);
        return answer;
    }
}