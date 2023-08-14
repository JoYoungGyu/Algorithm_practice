class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] check_lines = new int[200];

        for(int n =0; n<check_lines.length; n++){
            check_lines[n] = 0;
        }
        for(int i=0; i<lines.length; i++){
            int a = lines[i][0] +100;
            int b = lines[i][1] +100;
            for(int j=a; j<b; j++){
                check_lines[j]++;
            }
        }

        for(int k =0; k<check_lines.length; k++){
            if(check_lines[k] >1){
                answer++;
            }
        }
        return answer;
    }
}