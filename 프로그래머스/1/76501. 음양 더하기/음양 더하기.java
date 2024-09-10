class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        int num = 0;
        for(int i = 0; i < absolutes.length; i++){
            
            if(signs[i]==true){
                num += absolutes[i];
            }else{
                num -= absolutes[i];
            }
        }
        return num;
    }
}