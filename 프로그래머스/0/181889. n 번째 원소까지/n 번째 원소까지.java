import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(num_list[i]);
        }
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}