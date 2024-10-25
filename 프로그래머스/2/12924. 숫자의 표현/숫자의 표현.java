class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < n + 1; i++){
            int num = 0;
            int j = i;
            while(num < n + 1){
                num += j;
                if(num == n){
                    answer++;
                    break;
                }
                j++;
            }
        }
        return answer;
    }
}