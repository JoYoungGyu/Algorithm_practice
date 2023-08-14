import java.util.*;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        List<Integer> number_Jump = new ArrayList<>();

        for(int i=0; i<common.length-1; i++){
            number_Jump.add(common[i+1] - common[i]);
        }

        if(number_Jump.get(0) == number_Jump.get(number_Jump.size()-1)){
            answer = common[common.length-1] + number_Jump.get(0);
        }else{
            int pow = number_Jump.get(1)/number_Jump.get(0);
            answer = common[common.length-1] * pow;
        }

        return answer;
    }
}