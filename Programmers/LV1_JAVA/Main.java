class Solution {
    public long solution(long n) {
        long answer = 0;
        long count = 0;
        while(count<Math.sqrt(n)){
            if(Math.sqrt(n) == (count*count)){
                break;
            }
            count++;
        }
        if(count > Math.sqrt(n)){
            answer = -1;
        }else{
            answer = (count +1) * (count +1);
        }
        return answer;
    }
}