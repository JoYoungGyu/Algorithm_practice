class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0) == '-'){
            int len = s.length();
            s.substring(1,len);
            answer = Integer.parseInt(s);
        }
        else{
            answer = Integer.parseInt(s);
        }
        return answer;
    }
}