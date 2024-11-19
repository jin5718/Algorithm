import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){            
            if(!num.contains(arr[i]) && num.size() < k){
                num.add(arr[i]);
            }        
        }
        while(num.size() + 1 <= k){
            num.add(-1);
        }

        answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}