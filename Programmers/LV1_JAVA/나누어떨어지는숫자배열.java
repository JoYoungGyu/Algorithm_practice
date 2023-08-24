import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(factor -> factor%divisor == 0).toArray();

        if(answer.length == 0 ) answer = new int[]{-1};
        java.util.Arrays.sort(answer);

        return answer;
    }
}
/*
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                array.add(arr[i]);
            }
        }

        if(array.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[array.size()];
            Collections.sort(array);
            for(int j=0; j<array.size(); j++){
                answer[j] = array.get(j);
            }
        }

        return answer;
    }
}
*/
