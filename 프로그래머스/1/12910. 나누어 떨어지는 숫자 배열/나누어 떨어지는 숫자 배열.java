import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                num.add(arr[i]);
            }
        }
        if(num.size() == 0){
            num.add(-1);
        }else{
            Collections.sort(num);
        }
        
        int[] answer = new int[num.size()];
        
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}