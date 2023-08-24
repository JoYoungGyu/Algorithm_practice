import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str_Array = s.split("");
        if(s.length()%2==0){
            int cut_Index = s.length()/2;
            answer += str_Array[cut_Index-1];
            answer += str_Array[cut_Index];
        }else{
            int cut_Index2 = s.length()/2;
            answer += str_Array[cut_Index2];
        }
        return answer;
    }
}