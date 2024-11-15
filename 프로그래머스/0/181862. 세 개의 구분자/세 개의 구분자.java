import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        String tmp = "";
        for(int i = 0; i< myStr.length(); i++){
            char ch = myStr.charAt(i);
            if(ch == 'a' || ch == 'b' || ch == 'c'){
                if(tmp != ""){
                    arr.add(tmp);                    
                    tmp = "";
                }
            }else{
                tmp += String.valueOf(myStr.charAt(i));
            }
        }
        if(!tmp.isEmpty()){
            arr.add(tmp);
        }
       
        if(arr.isEmpty()){
            answer = new String[]{"EMPTY"};
        }else{
            answer = arr.toArray(new String[0]);
        }
        return answer;
    }
}