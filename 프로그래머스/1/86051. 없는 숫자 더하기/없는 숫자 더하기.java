class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int num = 45;
        for(int i = 0; i < numbers.length; i++){
            num -= numbers[i];
        }
        return num;
    }
}