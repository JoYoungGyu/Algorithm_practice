class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i< n+1; i++){
            int sum = 0;
            int count = 0;
            while(sum <=n){
                sum = sum+i+count;
                count++;
                if(sum == n){
                    answer++;
                }
            }
        }
        return answer;
    }
}

/*주어진 자연수를 연속된 자연수합으로 표현하는 방법의 수
*  ==
* 약수 중 홀수인 갯수
* */

class Solution {
    public int Finn(int n){
        int answer = 0;
        for(int i=1; i<n+1; i++){
            if(n%i == 0){
                if(i%2 == 1){
                    answer++;
                }
            }
        }
        return answer;
    }

    public int solution(int n) {
        int answer = 0;
        answer = Finn(n);
        return answer;
    }
}
