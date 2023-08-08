import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int max = 0;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                max = i;
            }
        }

        if( max != 0){
            b = b/max;
        }

        List<Integer> numArr = new ArrayList<>();

        for(int j=2; j < 1000; j++){
            if(b%j==0){
                numArr.add(j);
                b /= j;
                j--;
                if(b < 2) break;
            }
        }
        numArr.removeIf(value -> value == 2 || value == 5);
        if(numArr.size() == 0) return 1;
        return 2;
    }
}