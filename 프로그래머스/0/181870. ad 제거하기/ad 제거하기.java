import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < strArr.length; i++){
            if(!strArr[i].contains("ad")){
                arr.add(strArr[i]);
            }
        }
        answer = arr.toArray(new String[0]);
        return answer;
    }
}