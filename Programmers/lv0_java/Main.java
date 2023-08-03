import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        int c = ((sides[0]+sides[1])-sides[1]) -1;
        int d = sides[1] - sides[0];
        int e = sides[1] - d;

        answer = c+e;

        return answer;
    }
}