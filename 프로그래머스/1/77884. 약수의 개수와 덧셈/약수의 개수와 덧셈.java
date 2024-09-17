import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int n = left;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(n < right + 1){
            for(int i = 1; i < right + 1; i++){
                if(n % i == 0){
                    arr.add(i);
                }
            }
            if(arr.size() % 2 == 0){
                answer += n;
            }else{
                answer -= n;
            }
            n++;
            arr.clear();
        }
        
        return answer;
    }
}