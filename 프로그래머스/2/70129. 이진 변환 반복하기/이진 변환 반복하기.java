import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        
        ArrayList<String> arr = new ArrayList<>();
        
        while(!s.equals("1")){
            String news = s.replace("0","");
            zero += s.length() - news.length();
            if(s.equals(1)){
                break;
            }
            count += 1;
            
            int l = news.length();     
            
            while(l > 0){
                if(l % 2 > 0){
                    arr.add("1");
                    l /= 2;
                }else{
                    arr.add("0");
                    l /= 2;
                }
            }
            Collections.reverse(arr);    
            s = String.join("", arr);
            arr.clear();
        }
        answer[0] = count;
        answer[1] = zero;
        return answer;
    }
}