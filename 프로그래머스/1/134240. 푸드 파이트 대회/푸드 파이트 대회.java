import java.util.*;
class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i = 1; i < food.length; i++){
            food[i] = food[i] / 2;
        }
        for(int j = 1; j < food.length; j++){
            for(int l = 0; l < food[j]; l++){
                answer += j;
            }
        }
        answer += 0;
        
        for(int j = food.length - 1; j > 0; j--){
            for(int l = 0; l < food[j]; l++){
                answer += j;
            }
        }

        return answer;
    }
}