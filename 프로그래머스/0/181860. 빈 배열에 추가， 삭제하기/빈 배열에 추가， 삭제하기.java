import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(flag[i] == true){
                for(int j = 0; j < arr[i]*2; j++){
                    num.add(arr[i]);                    
                }
            }else{
                for(int k = 0; k <  arr[i]; k++){
                    num.remove(num.size() - 1);                    
                }
            }
        }
        answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}