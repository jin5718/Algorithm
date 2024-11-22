import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        
        ArrayList<Integer> con = new ArrayList<>();
        ArrayList<Integer> box = new ArrayList<>();
       
        for(int i = 1; i < order.length + 1; i++){
            con.add(i);
        }
        
        int targetIndex = 0;
        
        for(int i = 0; i < con.size(); i++){
            if (con.get(i) == order[targetIndex]) {
                answer++;
                targetIndex++;
                
                while (box.size() > 0 && box.get(box.size() - 1) == order[targetIndex]) {
                    answer++;
                    targetIndex++;
                    box.remove(box.size() - 1);
                }
            } else {
                box.add(con.get(i));
            }
        }
        
        return answer;
    }
}