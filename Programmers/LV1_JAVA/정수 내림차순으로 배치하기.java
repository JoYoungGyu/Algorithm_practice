import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str_n = Long.toString(n).split("");
        Arrays.sort(str_n);
        String str2 = "";
        for(int i=str_n.length-1; i>-1; i--){
            str2 = str2 + str_n[i];
        }
        answer = Long.parseLong(str2);
        return answer;
    }
}
