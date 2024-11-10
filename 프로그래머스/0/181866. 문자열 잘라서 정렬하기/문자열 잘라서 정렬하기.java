import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) != 'x'){
                tmp += String.valueOf(myString.charAt(i));
            }else{
                if(!tmp.equals("")){
                    arr.add(tmp);
                    tmp = "";                    
                }
            }
        }
        if(!tmp.equals("")){
            arr.add(tmp);            
        }
        Collections.sort(arr);
        answer = arr.toArray(new String[0]);
        return answer;
    }
}