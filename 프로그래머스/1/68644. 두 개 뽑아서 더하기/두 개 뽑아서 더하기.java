import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = 1; j < numbers.length; j++){
                int target = numbers[i] + numbers[j];
                if(!num.contains(target) && i!=j){
                    num.add(target);
            }
        }
        }
        Collections.sort(num);
        int[] answer = new int[num.size()];
        
        for(int i = 0; i < num.size(); i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}