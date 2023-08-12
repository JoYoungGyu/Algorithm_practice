class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        boolean check = false;
        String eq_Str = A;
        if(A.equals(B)){
            check = true;
            answer = 0;
        }else{
            for(int i = 0; i < A.length(); i++){
                String str2 = "";
                char b = eq_Str.charAt(eq_Str.length()-1);
                str2 = str2 + b;
                for(int j=0; j<A.length()-1;j++){
                    char a = eq_Str.charAt(j);
                    str2 = str2 + a;
                }

                if(str2.equals(B)){
                    answer++;
                    check = true;
                    break;
                }else{
                    answer++;
                    eq_Str = str2;
                }
            }
        }

        if(check == false){
            answer = -1;
        }


        return answer;
    }
}