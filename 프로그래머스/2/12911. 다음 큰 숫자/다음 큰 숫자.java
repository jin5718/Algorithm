class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        
        int m = n + 1;
        int mcnt = Integer.bitCount(m);
        while(true){            
            if(cnt == mcnt){
                answer = m;
                break;
            }
            m++;
        }
        return answer;
    }
}