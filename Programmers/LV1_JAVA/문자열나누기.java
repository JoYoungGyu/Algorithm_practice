class Solution {
    public int solution(String s) {
        int checkNumA = 1;
        int checkNumB = 0;
        int answer = 1;
        char checkCh = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(checkCh == s.charAt(i)){
                checkNumA++;
            }else{
                checkNumB++;
            }

            if(checkNumA == checkNumB){
                answer++;
                checkNumA = 1;
                checkNumB = 0;
                if(i<s.length()-1){
                    i++;
                    checkCh = s.charAt(i);
                }else{
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}
