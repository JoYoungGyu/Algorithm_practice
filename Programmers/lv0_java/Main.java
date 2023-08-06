class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int max_x = -9999, min_x = 9999;
        int max_y = -9999, min_y = 9999;
        for(int i=0; i<4; i++){
            if(max_x < dots[i][0]){
                max_x = dots[i][0];
            }
            if(min_x > dots[i][0]){
                min_x = dots[i][0];
            }
        }

        for(int j=0; j<4; j++){
            if(max_y < dots[j][1]){
                max_y = dots[j][1];
            }
            if(min_y > dots[j][1]){
                min_y = dots[j][1];
            }
        }

        answer = (max_x - min_x) * (max_y - min_y);
        return answer;
    }
}