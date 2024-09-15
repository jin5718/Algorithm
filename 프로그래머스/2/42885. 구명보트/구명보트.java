import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int count = 0;
        
        Arrays.sort(people);
        
        int i = 0;
        int j = people.length - 1;
        while(i <= j){
            if(people[i] + people[j] <= limit){
                count += 1;
                i ++;
                j --;
            }else{
                count += 1;
                j --;
            }
        }

        return count;
    }
}