class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int mx = -1;
        int sum = 0;
        for(int i = 0; i < sides.length; i++){
            if(mx < sides[i]){
                mx = sides[i];
            }
            sum += sides[i];
        }
        if(mx < sum-mx){
            answer = 1;
        }else{
            answer = 2;
        }
        
        return answer;
    }
}