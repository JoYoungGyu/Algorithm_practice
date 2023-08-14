import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        List<Long> array = new ArrayList<>();
        while(n>0){
            long value = n%10;
            array.add(value);
            n = n/10;
        }
        answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i).intValue();
        }

        return answer;
    }
}
