class Solution {
    public int getCount(int n){
        int result = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(i * i == n) result += 1;
            else if(n % i == 0) result += 2;
        }
        return result;
    }

    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] sword = new int[number];
        for(int i=1; i<number+1; i++){
            int sword_power = getCount(i);
            sword[i-1] = sword_power;
        }

        for(int j=0; j<sword.length; j++){
            if(sword[j] > limit){
                answer += power;
            }else{
                answer += sword[j];
            }
        }
        return answer;
    }
}
