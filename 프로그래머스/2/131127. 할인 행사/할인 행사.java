import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        // 시작날짜로부터 회원 자격이 부여되는 기간
        for(int l = 0; l < discount.length - 9; l++){
            // 원하는 물건의 개수를 담는 장바구니
            int[] cart = new int[want.length];

            // 장바구니에 담긴 물건의 종류
            for(int i = 0; i < want.length; i++){
                // 행사 시작날부터 마지막날의 물건들
                for(int j = l; j < l + 10; j++){
                    // 원하는 담긴 물건이 행사날의 물건과 동일하면
                    if(want[i].equals(discount[j])){
                        // 장바구니에 1 추가
                        cart[i] += 1;
                        
                        // 장바구니에 담긴 물건의 개수와 원하는 물건의 개수가 같으면
                        for(int m = 0; m < cart.length; m++){
                            if(cart[m] == number[m]){
                                if(m == cart.length - 1){
                                    answer += 1;
                                    System.out.println(l);
                                }
                            }else{
                                break;
                            }
                        }
                    }
                }
            }       
        }
    
        return answer;
    }
}