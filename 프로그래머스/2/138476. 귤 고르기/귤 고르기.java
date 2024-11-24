import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> box = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++){
            if(!box.containsKey(tangerine[i])){
                box.put(tangerine[i], 1);
            }else{
                box.put(tangerine[i], box.get(tangerine[i]) + 1);
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<>(box.values());
        arr.sort(Collections.reverseOrder());
        
                
        int l = 0;
        
        while(answer < k){
            answer += arr.get(l);            
            l++;
        }
        answer = l;
        
        
        return answer;
    }
}