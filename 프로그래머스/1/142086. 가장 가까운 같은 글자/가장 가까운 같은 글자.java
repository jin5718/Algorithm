class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];        
        answer[0] = -1;
        for(int i = 1; i < s.length(); i++){
            int n = 0;
            for(int j = i - 1; j >= 0; j--){
                n++;
                if(j == 0 && s.charAt(i)!=s.charAt(j)){
                    answer[i] = -1;
                    break;
                    
                }
                if(s.charAt(i) == s.charAt(j)){
                    answer[i] = n;
                    n = 0;
                    break;
                }
                
            }
        }
        return answer;
    }
}