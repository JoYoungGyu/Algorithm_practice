class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int S = brown + yellow;

        for(int height =1; height <S; height ++){
            int width = S/height ;
            int Y = (width -2) * (height-2);
            int B = S-Y;

            if(Y==yellow && B==brown){
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}
