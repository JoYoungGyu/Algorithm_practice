class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int del_Zero = 0;
        int trans_Bin = 0;
        String result = s;
        while(!result.equals("1")){
            for(int i=0; i<result.length(); i++){
                if(result.charAt(i) == '0'){
                    del_Zero++;
                }
            }
            result = result.replaceAll("0","");
            result = Integer.toBinaryString(result.length());
            trans_Bin++;
        }

        answer[0] = trans_Bin;
        answer[1] = del_Zero;
        return answer;
    }
}
