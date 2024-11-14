class Solution {
    public int solution(String binomial) {
        int answer = 0;
        int num1 = 0;
        int num2 = 0;
        String tmp = "";
        Character res = ' ';
        for(int i = 0; i < binomial.length(); i++){
            if(binomial.charAt(i) != ' ' && binomial.charAt(i) != '+' && binomial.charAt(i) != '*' && binomial.charAt(i) != '-'){
                tmp += String.valueOf(binomial.charAt(i));
            }else if(binomial.charAt(i) == ' '){
                if(num1 == 0 && tmp != ""){
                    num1 = Integer.parseInt(tmp);
                    tmp = "";
                }
            }else if(binomial.charAt(i) == '+'){
                res = '+';
            }else if(binomial.charAt(i) == '-'){
                res = '-';
            }else if(binomial.charAt(i) == '*'){
                res = '*';
            }
        }
        num2 = Integer.parseInt(tmp);
        
        if(res == '+'){
            answer = num1 + num2;
        }else if(res == '-'){
            answer = num1 - num2;
        }else{
            answer = num1 * num2;
        }

        return answer;
    }
}