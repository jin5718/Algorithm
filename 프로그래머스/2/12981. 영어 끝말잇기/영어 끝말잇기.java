import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        
        ArrayList<String> useword = new ArrayList<>();        
        useword.add(words[0]);
        String endword = words[0];
        char end = endword.charAt(endword.length() - 1);        
        
        // j -> 몇 번째 사람인가
        int j = 1;
        
        for (int i = 1; i < words.length; i++) {
            // 앞 사람이 말한 단어의 문자 체크
            char start = words[i].charAt(0);
            if (end != start) {
                answer[0] = i % n + 1; // i를 사용하여 현재 사람 번호 계산
                answer[1] = i / n + 1;
                break;
            }
            
            // 이전에 등장했던 단어 체크
            if (useword.contains(words[i])) {
                answer[0] = i % n + 1; // i를 사용하여 현재 사람 번호 계산
                answer[1] = i / n + 1;
                break; // 중복 단어에서 멈추기
            } else {
                useword.add(words[i]);
            }

            // 한 글자 단어 체크
            if (words[i].length() == 1) {
                answer[0] = i % n + 1; // i를 사용하여 현재 사람 번호 계산
                answer[1] = i / n + 1;
                break;
            }
            
            // 마지막 문자 갱신
            endword = words[i];
            end = endword.charAt(endword.length() - 1);

            // j 업데이트
            j++;
            if (j > n) {
                j = 1;
            }
        }
        
        return answer;
    }
}
