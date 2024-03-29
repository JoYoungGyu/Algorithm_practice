import java.util.*;

/*내가 직접 짠 소스*/
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str_arr = s.split(" ");
        int[] int_arr = new int[str_arr.length];
        for(int i=0; i<str_arr.length; i++){
            int_arr[i] = Integer.parseInt(str_arr[i]);
        }
        Arrays.sort(int_arr);
        answer = int_arr[0] + " " + int_arr[int_arr.length-1];
        return answer;

    }
}

/*다른 사람의 풀이를 보고 클래스를 이용해서 푼 풀이*/
public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] tmp = str.split(" ");
        int min, max, n;
        min = max = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }

        return min + " " + max;

    }

    public static void main(String[] args) {
        String str = "1 2 3 4";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
