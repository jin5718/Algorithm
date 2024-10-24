import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i< arr.length; i++){
            if(arr[i] >= 50 && arr[i] % 2 == 0){
                num.add(arr[i] / 2);
            }else if(arr[i] < 50 && arr[i] % 2 != 0){
                num.add(arr[i] * 2);
            }else{
                num.add(arr[i]);
            }
        }
        
        answer = num.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}