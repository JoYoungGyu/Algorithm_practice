class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt = 0;
        int y_cnt = 0;

        s = s.replaceAll("p","*");
        s = s.replaceAll("P","*");
        s = s.replaceAll("Y","@");
        s = s.replaceAll("y","@");

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '*'){
                p_cnt ++;
            }
            if(s.charAt(i) == '@'){
                y_cnt ++;
            }
        }

        if(p_cnt == y_cnt){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
