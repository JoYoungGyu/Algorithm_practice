class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int idx = 0;
        String numStr = "";
        int n = 0;
        for(int i=0; i<dartResult.length(); i++){
            char c = dartResult.charAt(i);
            if(c >= '0' && c <= '9'){
                numStr += String.valueOf(c);
                // 숫자가 한자리수가 아니라 10일수있기 때문에 문자열을 더해줌
            }else if(c == 'S' || c == 'D' || c == 'T'){
                n = Integer.parseInt(numStr);
                //제곱을 나눠줌
                if(c=='S'){
                    score[idx++] = (int)Math.pow(n,1);
                }else if(c=='D'){
                    score[idx++] = (int)Math.pow(n,2);
                }else{
                    score[idx++] = (int)Math.pow(n,3);
                }
                //문자열 초기화
                numStr = "";
            }else if(c=='*'){
                score[idx-1] *=2;
                if(idx-2>=0){
                    score[idx-2] *=2;
                    // 문제에서 *은 중복이 된다고 했음 그래서 그 앞에 값을 중복으로 *2해주는 거임
                }
            }else{
                score[idx-1] *=-1;
                // #은 음수로 변경
            }
        }
        int answer = score[0] + score[1] + score[2];
        return answer;
    }
}
