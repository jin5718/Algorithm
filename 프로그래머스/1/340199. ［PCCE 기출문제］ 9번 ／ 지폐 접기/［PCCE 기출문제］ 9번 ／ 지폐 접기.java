class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int cnt = 0;
        while(true){
            int mnb = Math.min(bill[0], bill[1]);
            int mxb = Math.max(bill[0], bill[1]);
            int mnw = Math.min(wallet[0], wallet[1]);
            int mxw = Math.max(wallet[0], wallet[1]);
            if(mnb <= mnw && mxb <= mxw){
                break;
            }else{
                if(bill[0] > bill[1]){
                    bill[0] = bill[0] / 2;
                    answer += 1 ;

                }else if(bill[0] < bill[1]){
                    bill[1] = bill[1] / 2;
                    answer += 1 ;
                }
            }
        }
        return answer;
    }
}