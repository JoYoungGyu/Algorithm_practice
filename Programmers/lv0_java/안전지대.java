class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==1){
                    for(int dx =-1; dx<2; dx++){
                        for(int dy =-1; dy <2; dy++){
                            int ni = i+dx;
                            int ny = j+dy;

                            if(ni >-1 && ni <n && ny >-1 && ny <n && board[ni][ny] != 1){
                                board[ni][ny] = 2;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] != 1 && board[i][j] != 2) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
