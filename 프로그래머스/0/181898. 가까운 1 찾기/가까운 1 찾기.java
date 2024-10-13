class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;
        int i = idx;
        while(i < arr.length){
            if(arr[i] == 1){
                answer = i;
                break;
            }
            i += 1;
        }
        return answer;
    }
}