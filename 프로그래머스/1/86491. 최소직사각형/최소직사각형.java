import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> mx = new ArrayList<>();
        ArrayList<Integer> mn = new ArrayList<>();
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                mx.add(sizes[i][0]);
                mn.add(sizes[i][1]);
            }else if(sizes[i][0] < sizes[i][1]){
                mx.add(sizes[i][1]);
                mn.add(sizes[i][0]);
            }else{
                mx.add(sizes[i][1]);
                mn.add(sizes[i][0]);            }
        }
        answer = Collections.max(mx) * Collections.max(mn);
        return answer;
    }
}