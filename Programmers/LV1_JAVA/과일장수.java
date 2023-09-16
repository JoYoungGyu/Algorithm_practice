import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int box_count = score.length/m;
        int[] max_box = new int[m];

        Integer[] score2 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(score2 , Collections.reverseOrder());
        int check = 0;
        while(check<score.length){
            check+=m;

            if(check > score.length){
                break;
            }

            answer += (score2[check-1] * m);
        }

        return answer;
    }
}
