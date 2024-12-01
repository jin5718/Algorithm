import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> two = new ArrayList<>();
        int l = 1;
        int i = 1;
        two.add(1);

        // 2의 거듭제곱 값을 두 리스트에 저장
        while (i < 11) {
            two.add(l * 2);
            l *= 2;
            i++;
        }

        // arr를 ArrayList로 변환
        ArrayList<Integer> ans = new ArrayList<>();
        for (int k : arr) {
            ans.add(k);
        }

        // arr의 길이에 따라 적절한 2의 거듭제곱 값을 찾기
        for (int j = 0; j < two.size(); j++) {
            if (arr.length == two.get(j)) {
                answer = Arrays.copyOf(arr, arr.length);
                break;
            } else if (arr.length < two.get(j)) {
                while (ans.size() < two.get(j)) {
                    ans.add(0);
                }
                answer = ans.stream().mapToInt(Integer::intValue).toArray();
                break;
            }
        }
        return answer;
    }
}
