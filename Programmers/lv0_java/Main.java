class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int garo = 0, sero = 0;
        int limit_garo = (board[0])/2;
        int limit_sero = (board[1])/2;
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left") && garo > ((limit_garo)*-1)){
                garo--;
            }else if(keyinput[i].equals("right") && garo < limit_garo){
                garo++;
            }else if(keyinput[i].equals("down") && sero > ((limit_sero)*-1)){
                sero--;
            }else if(keyinput[i].equals("up") && sero < limit_sero){
                sero++;
            }
        }
        answer[0] = garo;
        answer[1] = sero;
        return answer;
    }
}