class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            String empty_check = babbling[i];
            empty_check = empty_check.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            empty_check = empty_check.replaceAll("aya|ye|woo|ma", "");
            if(empty_check.equals("")){
                answer++;
            }
        }
        return answer;
    }
}