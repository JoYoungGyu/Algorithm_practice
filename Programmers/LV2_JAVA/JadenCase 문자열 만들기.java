
/*내가 짠 코드*/
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        if(!s.isEmpty()){
            char firstChar = Character.toUpperCase(s.charAt(0));
            answer.append(firstChar);

            for(int i=1; i<s.length(); i++){
                if(s.charAt(i-1) == ' '){
                    char upperChar = Character.toUpperCase(s.charAt(i));
                    answer.append(upperChar);
                }else{
                    char lowerChar = Character.toLowerCase(s.charAt(i));
                    answer.append(lowerChar);
                }
            }
        }
        return answer.toString();
    }
}


/*다른사람이 짠 소스*/
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sp = s.toLowerCase().split("");
        boolean flag = true;

        for(String ss : sp) {
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }

        return answer;
    }
}
