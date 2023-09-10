class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];
        for(int i=0; i<s.length(); i++){
            if(alphabet[s.charAt(i)-'a'] != 1){
                alphabet[s.charAt(i)-'a'] = 1;
                answer[i] = -1;
                int count = 1;
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        answer[j] = count;
                        count = 1;
                    }else{
                        count ++;
                    }
                }
            }else{
                continue;
            }
        }
        return answer;
    }
}