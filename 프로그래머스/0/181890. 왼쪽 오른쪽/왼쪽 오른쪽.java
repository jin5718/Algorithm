import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        // String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                for(int j = 0; j < i; j++){
                    arr.add(str_list[j]);
                }
                break;
            }else if(str_list[i].equals("r")){
                for(int k = i+1; k < str_list.length; k++){
                    arr.add(str_list[k]);
                }
                break;
            }
        }
        // System.out.println(arr);
        
        String[] answer;
        
        if(!arr.isEmpty()){
            answer = arr.toArray(new String[0]);
        }else{
            answer = new String[0];
        }
        return answer;
    }
}