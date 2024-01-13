/*
* 백준 9012 괄호 
* 스택 사용
* */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            String S = br.readLine();
            stack.clear();
            boolean chkFlag = true;
            for(int j = 0; j<S.length(); j++){
                if(S.charAt(j) == '('){
                    stack.push('(');
                }else{
                    if(stack.isEmpty()){
                        chkFlag = false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(chkFlag && stack.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}