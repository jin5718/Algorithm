import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < 30; i++){
            map.put(i+1, 0);
        }
        
        for(int j = 0; j < strArr.length; j++){
            map.put(strArr[j].length(), map.get(strArr[j].length()) + 1);
        }
        
        ArrayList<Integer> arr = new ArrayList<>(map.values());
        answer = Collections.max(arr);
        return answer;
    }
}