class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int left = 0;
        int right = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                left++;
            }else if(s.charAt(i) == ')'){
                right++;
            }

            if(left < right){
                return false;
            }
        }

        if(s.charAt(0) == ')'){
            answer =false;
        }else if(left == right){
            answer = true;
        }else{
            answer = false;
        }

        if(left==0 && right ==0){
            answer = false;
        }

        return answer;
    }
}

/*
if(left < right){
   return false;
 }
왜 이 부분이 있냐??
이걸 해줘야"())(" 이 오류를 잡을 수 있음
*/


/*스택으로 구현한 코드*/

import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> sc = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                sc.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(sc.isEmpty()){
                    return false;
                }
                sc.pop();
            }
        }
        if(sc.isEmpty()){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
