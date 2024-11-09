import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        int tmp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i)=='x'){
                arr.add(tmp);
                tmp = 0;
            }else{
                tmp += 1;
            }
        }
        arr.add(tmp);
        answer = arr.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}