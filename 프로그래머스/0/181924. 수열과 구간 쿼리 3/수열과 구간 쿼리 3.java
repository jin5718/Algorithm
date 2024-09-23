import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            res.add(arr[i]);
        }
        System.out.println(res);    

        int i = 0; 
        while(i < queries.length) {
            int temp;
            temp = res.get(queries[i][0]);

            res.set(queries[i][0], res.get(queries[i][1]));
            res.set(queries[i][1], temp);
            
            i++;
        }
        answer = res.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}