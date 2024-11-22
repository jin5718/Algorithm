import java.util.*;

class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int i = 0;
        int j = B.length-1;        
        
        while(i < A.length){
            answer += A[i] * B[j];
            i ++;
            j --;
        }
        
        return answer;
    }
}