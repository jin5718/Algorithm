
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int j = 0;
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        
        for(int l = 0; l < delete_list.length; l++){
            n.add(delete_list[l]);
        }
        
        while(j < arr.length){
            if(!n.contains(arr[j])){
                num.add(arr[j]);
            }
            j++;
        }
        
        answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}