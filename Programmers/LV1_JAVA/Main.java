import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        char[] str = new char[strings.length];
        String[] answer = new String[strings.length];
        for(int i=0; i<strings.length; i++){
            str[i] = strings[i].charAt(n);
        }
        Arrays.sort(strings);
        Arrays.sort(str);
        List<String> strList = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i<str.length; i++){
            for(int j=0; j<strList.size(); j++){
                if(str[i] == strList.get(j).charAt(n)){
                    answer[i] = strList.get(j);
                    strList.remove(j);
                    break;
                }
            }
        }
        return answer;
    }
}