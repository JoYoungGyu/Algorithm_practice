import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        String[] str_X = X.split("");
        String[] str_Y = Y.split("");
        Arrays.sort(str_X, Collections.reverseOrder());
        Arrays.sort(str_Y, Collections.reverseOrder());
        for(int i=0; i<str_X.length; i++){
            for(int j=0; j<str_Y.length; j++){
                if(str_X[i].equals(str_Y[j])){
                    answer+=str_X[i];
                    str_Y[j] = "99";
                    break;
                }
            }
        }
        if(answer.equals("")){
            answer = "-1";
        }
        if(answer.length()>1){
            if(answer.charAt(1) == '0'&&answer.charAt(0) == '0'){
                answer = "0";
            }
        }
        return answer;
    }
}