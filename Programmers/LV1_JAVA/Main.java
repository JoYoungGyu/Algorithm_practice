import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        long money2 = money;
        for(int i=1; i<count+1; i++){
            sum += price*i;
        }

        money2 = money2 - sum;
        if(money2 > -1){
            answer = 0;
        }else{
            answer = money2 * -1;
        }
        return answer;
    }
}