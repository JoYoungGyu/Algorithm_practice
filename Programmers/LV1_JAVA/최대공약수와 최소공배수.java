import java.util.*;

class Solution {
    public int min_A(int a, int b){
        int length = Math.max(a,b);
        int min_a = 0;
        for(int i=1; i<length+1; i++){
            if(a%i==0 && b%i==0){
                min_a = i;
            }
        }
        return min_a;
    }

    public int max_A(int a, int b){
        int length = Math.max(a,b);
        int max_a = 0;
        for(int i=1; i<length+1; i++){
            if(a%i==0 && b%i==0){
                max_a = i;
            }
        }
        return max_a;
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = min_A(n,m);
        answer[1] = (n*m)/answer[0];
        return answer;
    }
}
