class Solution {
    public int count_Num(int n){
        int count=0;
        for(int i =1; i<n+1; i++){
            if(n%i==0){
                count++;
            }
        }
        return count;
    }

    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<right+1; i++){
            int a = count_Num(i);
            if(a%2==0){
                answer += i;
            }else{
                answer -= i;
            }
        }
        return answer;
    }
}