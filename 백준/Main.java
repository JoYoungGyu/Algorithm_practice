/*
    백준 4949 균형잡힌 세상
    스택사용
* */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Stack;

public class Main{
    public static String getValue(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char value = s.charAt(i);
            if(value == '(' || value == '['){
                stack.push(value);
            }

            if(value == ')'){
                if(stack.isEmpty() || stack.peek() != '('){
                    return "no";
                }else{
                    stack.pop();
                }
            }else if( value == ']'){
                if(stack.isEmpty() || stack.peek() != '['){
                    return "no";
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()){
            return "yes";
        }else{
            return "no";
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = br.readLine();
            if(s.equals(".")){
                break;
            }
            System.out.println(getValue(s));
        }
    }
}