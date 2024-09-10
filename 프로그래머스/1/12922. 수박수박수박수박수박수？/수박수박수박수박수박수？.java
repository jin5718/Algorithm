class Solution {
    public String solution(int n) {
        String answer = "";
        String tnqkr = "수박";
        if(n%2 == 0){
            answer = tnqkr.repeat(n/2); 
        }else{
            answer = tnqkr.repeat(n/2) + "수";
        };
        
        return answer;
    }
}