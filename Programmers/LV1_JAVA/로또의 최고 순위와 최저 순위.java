class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero_Count = 0;
        int success_Count = 0;
        for(int i=0; i<lottos.length;i++){
            if(lottos[i] == 0){
                zero_Count++;
            }else{
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        success_Count++;
                        continue;
                    }
                }
            }
        }
        if(success_Count==6){
            answer[0] = 1;
            answer[1] = 1;
        }else{
            int win_rank = success_Count + zero_Count;
            int lose_rank = success_Count;
            if(win_rank == 6){
                answer[0] = 1;
            }else if(win_rank == 5){
                answer[0] = 2;
            }else if(win_rank == 4){
                answer[0] = 3;
            }
            else if(win_rank == 3){
                answer[0] = 4;
            }
            else if(win_rank == 2){
                answer[0] = 5;
            }else{
                answer[0] = 6;
            }

            if(lose_rank == 6){
                answer[1] = 1;
            }else if(lose_rank == 5){
                answer[1] = 2;
            }else if(lose_rank == 4){
                answer[1] = 3;
            }
            else if(lose_rank == 3){
                answer[1] = 4;
            }
            else if(lose_rank == 2){
                answer[1] = 5;
            }else{
                answer[1] = 6;
            }
        }

        return answer;
    }
}
