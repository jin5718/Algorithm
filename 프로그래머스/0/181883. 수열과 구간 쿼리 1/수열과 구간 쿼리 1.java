import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int j = 0; j < queries.length; j++){
            for(int i = queries[j][0]; i < queries[j][1] + 1; i++){
                arr[i] = arr[i]+1;   
            }
        }
        answer = Arrays.copyOf(arr, arr.length);
        return answer;
    }
}