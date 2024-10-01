import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        
        int num = l - (l % 5);
        int nm = r - (l % 5);
            
        ArrayList<Integer> arr = new ArrayList<>();
        while(num <= nm){
            String tmp = String.valueOf(num);
            boolean isValid = true;
            for(int i = 0; i < tmp.length(); i++){
                if(tmp.charAt(i) != '0'  && tmp.charAt(i) != '5'){
                    isValid = false;
                    break;
                }
            }
            
            if(isValid){
                arr.add(Integer.parseInt(tmp));
            }
            num += 5;
        }
        if(arr.isEmpty()){
            arr.add(-1);
        }
        
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}