class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int max = Math.max(a,b);
        int min = Math.min(a,b);

        if(max == min){
            answer = max;
        }else{
            for(int i=min; i<max+1; i++){
                answer +=i;
            }
        }

        return answer;
    }
}
