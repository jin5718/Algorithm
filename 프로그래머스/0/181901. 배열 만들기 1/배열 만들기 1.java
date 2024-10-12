import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % k == 0){
                arr.add(i);
            }
        }
        System.out.println(arr);
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}