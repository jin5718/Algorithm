import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int n = arr[arr.length - 1];
        
           
        int j = 0;
        int i = 2;
        
        int num = arr[arr.length - 1];
        while(j < arr.length){
            
            if(j == arr.length - 1){
                answer = n;
                break;
            }            
            if(n % arr[j] != 0){
                n = arr[arr.length - 1] * i;
                i ++;
                j = 0;
            }else{
                j ++;
            }
            answer = n;
        }
        
        return answer;
    }
}