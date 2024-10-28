class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if(num_list.length >= 11){
            for(int i = 0; i < num_list.length; i++){
                answer += num_list[i];
            }
        }else{
            answer = num_list[0];
            for(int i = 1; i < num_list.length; i++){
                answer *= num_list[i];
            }
            // answer = answer * num_list[0];
        }
        return answer;
    }
}