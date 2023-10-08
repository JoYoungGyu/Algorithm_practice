class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n+1];
        for(int i = 0; i<lost.length; i++){
            student[lost[i]] = 1;
        }

        for(int j=0; j<reserve.length; j++){
            int check = 1;
            if( (reserve[j] -1) > 0 && student[reserve[j] - 1] == 1){
                student[reserve[j]-1] = 0;
                check--;
            }
            else if((reserve[j]+1) < student.length && student[reserve[j] + 1] == 1 && check == 1){
                student[reserve[j]+1] = 0;
            }
        }

        for(int i=1; i<student.length; i++){
            if(student[i] != 1){
                answer++;
            }
        }
        return answer;
    }
}