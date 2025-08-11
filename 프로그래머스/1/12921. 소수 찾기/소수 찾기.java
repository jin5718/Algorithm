class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int j = 2; j <= n; j++){            
            if(isPrime(j) == true){
                answer ++;
            }
        }
        return answer;
    }
    
    public static boolean isPrime(int num){
        for(int i = 2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }
}