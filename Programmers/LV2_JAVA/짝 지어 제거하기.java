import java.util.Stack;

/*
* 정답 코드
* */
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        int answer = -1;
        for(int i =0; i<s.length(); i++){
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }


        if(stack.isEmpty()){
            answer = 1;
        }else{
            answer = 0;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}


/*
* 시간초과 나는 코드
* */

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        StringBuffer str = new StringBuffer(s);

        for(int i=0; i<str.length()-1; i++){

            if(str.charAt(i) == str.charAt(i+1)){
                str.delete(i, i+2);
                i=-1;
            }

        }
        if(str.length() == 0){
            answer = 1;
        }else{
            answer = 0;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(str);

        return answer;
    }
}
