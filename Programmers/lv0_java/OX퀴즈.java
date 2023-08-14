import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = {};
        List<String> array = new ArrayList<>();
        for(int i=0; i<quiz.length; i++){
            String str = quiz[i].replaceAll("\"","");
            String[] check_value = str.split(" ");
            if(check_value[1].equals("+")){
                if(Integer.valueOf(check_value[4]) == Integer.valueOf(check_value[0]) + Integer.valueOf(check_value[2])){
                    array.add("O");
                }else array.add("X");
            }else if(check_value[1].equals("-")){
                if(Integer.valueOf(check_value[4]) == Integer.valueOf(check_value[0]) - Integer.valueOf(check_value[2])){
                    array.add("O");
                }else array.add("X");
            }
        }
        answer = array.toArray(new String[array.size()]);
        return answer;
    }
}
