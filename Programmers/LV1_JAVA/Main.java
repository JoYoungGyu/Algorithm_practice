class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] check_number = new int[10];
        for(int i=0; i<numbers.length; i++){
            check_number[numbers[i]] = 1;
        }

        for(int j=0; j<check_number.length; j++){
            if(check_number[j] != 1){
                answer += j;
            }
        }

        return answer;
    }
}