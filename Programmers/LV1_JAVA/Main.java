class Solution {
    public boolean getPrime(int n){
        boolean check = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                check = false;
                break;
            }
        }
        return check;
    }
    public int solution(int n) {
        int answer = 0;
        if(n==2){
            answer = 1;
        }else{
            for(int i=2; i<=n; i++){
                if(getPrime(i)){
                    answer ++;
                }
            }
        }
        return answer;
    }
}