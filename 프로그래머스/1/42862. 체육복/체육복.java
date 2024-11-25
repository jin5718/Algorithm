import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;

        Set<Integer> arr = new HashSet<>();
        Set<Integer> stu = new HashSet<>();        
        
        Arrays.sort(lost);
        Arrays.sort(reserve);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    stu.add(lost[i]);
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (stu.contains(lost[i])) 
                continue;

            for (int j = 0; j < reserve.length; j++) {
                if (!stu.contains(reserve[j]) && 
                    !arr.contains(reserve[j]) && 
                   (lost[i] + 1 == reserve[j] || lost[i] - 1 == reserve[j])) {
                    arr.add(reserve[j]); 
                    break;
                }
            }
        }

        if (answer + arr.size() + stu.size() > n) {
            answer = n;
        } else {
            answer += arr.size() + stu.size();
        }

        return answer;
    }
}
