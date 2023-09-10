class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++){
            int half = food[i]/2;
            for(int j=0; j<half; j++){
                answer += String.valueOf(i);
            }
        }
        answer += String.valueOf(0);
        for(int i=answer.length()-2; i>-1; i--){
            answer += String.valueOf(answer.charAt(i));
        }
        return answer;
    }
}