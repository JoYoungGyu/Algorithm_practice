import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str_Arr = s.split("");
        ArrayList<String> str_Array = new ArrayList<>();
        for(int i = 0; i<str_Arr.length; i++){
            str_Array.add(str_Arr[i]);
        }
        Collections.sort(str_Array,Collections.reverseOrder());
        for(int j=0; j<str_Array.size(); j++){
            answer += str_Array.get(j);
        }

        return answer;
    }
}
