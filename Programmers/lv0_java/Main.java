class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            int check = 0;
            babbling[i] = babbling[i].replace("aya","*");
            babbling[i] = babbling[i].replace("ye","*");
            babbling[i] = babbling[i].replace("woo","*");
            babbling[i] = babbling[i].replace("ma","*");
            for(int j=0; j<babbling[i].length(); j++){
                if(babbling[i].charAt(j) != '*'){
                    check = 1;
                }
            }
            if(check == 0){
                answer++;
            }
        }
        return answer;
    }
}