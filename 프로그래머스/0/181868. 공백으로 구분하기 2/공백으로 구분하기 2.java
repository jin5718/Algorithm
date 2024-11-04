import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        StringBuilder sb = new StringBuilder();
        String tmp = "";
        ArrayList<String> ans = new ArrayList<>();
        
        my_string = my_string.replaceAll(" ", "*");
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) != '*'){
                tmp += String.valueOf(my_string.charAt(i));
            }else if(!tmp.equals("") && my_string.charAt(i) == '*'){
                ans.add(tmp);
                tmp = "";
            }
            if(i == my_string.length() - 1 && !tmp.equals("")){
                ans.add(tmp);
            }
        }
        answer = ans.toArray(new String[0]);
        return answer;
    }
}