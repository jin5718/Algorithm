import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;       
        int[] num = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            num[i] = arr[i];
        }
        
        while(true){            
            for(int j = 0; j < num.length; j++){
                if(arr[j] >= 50 && arr[j] % 2 == 0){
                    arr[j] = arr[j] / 2;
                }else if(arr[j] < 50 && arr[j] % 2 != 0){
                    arr[j] = (arr[j] * 2) + 1;
                }
            }            
            if(Arrays.equals(num, arr)){
                break;
            }
            // System.out.println(Arrays.toString(arr) + "arr");
            // System.out.println(Arrays.toString(num) + "num");
            num = Arrays.copyOfRange(arr, 0, arr.length);
            answer++;
        }
        // System.out.println(i);
        
        return answer;
    }
}