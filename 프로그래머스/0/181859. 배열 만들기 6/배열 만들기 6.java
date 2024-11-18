import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int i = 0;
        ArrayList<Integer> stk = new ArrayList<>();
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i++;
            }else{
                if(stk.get(stk.size() - 1) == arr[i]){
                    stk.remove(stk.size() - 1);
                    i++;
                }else if(stk.get(stk.size() - 1) != arr[i]){
                    stk.add(arr[i]);
                    i++;
                }
            }
        }
        if(!stk.isEmpty()){
            answer = stk.stream().mapToInt(Integer::intValue).toArray();
        }else{
            stk.add(-1);
            answer = stk.stream().mapToInt(Integer::intValue).toArray();            
        }
        return answer;
    }
}