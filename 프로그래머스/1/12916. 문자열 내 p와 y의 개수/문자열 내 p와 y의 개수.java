class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pnum = 0;
        int ynum = 0;
              
        for(int i = 0; i < s.length(); i++){
            if(Character.toString(s.charAt(i)).equals("p") || Character.toString(s.charAt(i)).equals("P")){
                pnum += 1;
            }else if(Character.toString(s.charAt(i)).equals("y") || Character.toString(s.charAt(i)).equals("Y")){
                ynum += 1;
            }
        }
        if(pnum == 0 && ynum == 0){
            answer = true;
        }else{
            if(pnum == ynum){
                answer = true;
            }else{
                answer = false;
            }

            
        }
        

        return answer;
    }
}