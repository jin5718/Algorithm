class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        
        int m = n + 1;
        while(Integer.bitCount(m) != cnt){                   
            m++;
        }
        return m;
    }
}