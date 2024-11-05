class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        String txt = "";
        // myString = myString.replaceAll(pat, "*");
        String myString2 = myString.replaceAll(pat, "*");
        
        int i = myString2.length()-1;
        while(i >= 0){
            if(myString2.charAt(i) == '*'){
                for(int j = 0; j < i; j++){
                    txt += String.valueOf(myString.charAt(j));
                }
                break;
            }
            i--;
        }
        answer = txt + pat;
        return answer;
    }
}