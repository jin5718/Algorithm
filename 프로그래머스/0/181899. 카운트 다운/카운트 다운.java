class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] num = new int[start_num - end_num +1];
        int n = start_num;
        for(int i = 0; i < num.length; i++){
            num[i] = n;
            n -= 1;
        }
        return num;
    }
}