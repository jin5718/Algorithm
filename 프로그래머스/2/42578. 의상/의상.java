import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int l = 0; l < clothes.length; l++){
            if(!map.containsKey(clothes[l][1])){
                map.put(clothes[l][1], 1);
            }else{
                map.put(clothes[l][1], map.get(clothes[l][1]) + 1);                
            }
        }
        
        Collection<Integer> values = map.values();
        int sum = 1;
        
        for(Integer value : values){
            sum *= (value + 1);
        }

        sum -= 1;

        answer = sum;
        
        return answer;
    }
}
