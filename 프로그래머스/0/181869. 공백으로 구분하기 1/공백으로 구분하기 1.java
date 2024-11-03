import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder();
        String tmp = "";
        ArrayList<String> ans = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != ' '){
                tmp += String.valueOf(my_string.charAt(i));
            }else{
                ans.add(tmp);
                tmp = "";
            }
            if(i == my_string.length() - 1){
                ans.add(tmp);
            }
        }
        answer = ans.toArray(new String[0]);
        return answer;
    }
}