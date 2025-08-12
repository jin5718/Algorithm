class Solution {
    public int solution(int[] nums) {

        int answer = 0;
        

        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i + 1; j < nums.length-1; j++){
                for(int l = j+1; l<nums.length; l++){
                    if(isPrime(nums[i] + nums[j] + nums[l])){
                        answer += 1;
                    }
                }
            }
        }

        return answer;
    }
    
           public static boolean isPrime(int num){
            for(int n = 2; n*n <= num; n++){
                if(num % n == 0){
                    return false;
                }
            }
            return true;
        }

}