import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = Integer.toString(n,3);
        StringBuffer sb = new StringBuffer(a);
        String a2 = sb.reverse().toString();

        answer = Integer.parseInt(a2, 3);
        return answer;
    }
}
