import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                num.add(arr[i]);               
            }
        }
        answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}