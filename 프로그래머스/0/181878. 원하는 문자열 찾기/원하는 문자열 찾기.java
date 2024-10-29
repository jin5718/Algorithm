// import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        myString = myString.replaceAll(pat, "*");

        if(myString.contains("*")){
            answer = 1;
        }
        
        return answer;
    }
}