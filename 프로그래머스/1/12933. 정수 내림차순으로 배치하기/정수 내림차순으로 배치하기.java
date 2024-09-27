import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> list1 = new ArrayList<>();
        String N = String.valueOf(n);
        for(int i = 0; i < N.length(); i++){
            list1.add(Integer.parseInt(String.valueOf(N.charAt(i))));
        }
        Collections.sort(list1);
        Collections.reverse(list1);

        
        StringBuilder sb = new StringBuilder();
        for (Integer num : list1){
            sb.append(num);
        }
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}