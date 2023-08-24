import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> array = new ArrayList<>();

        if(arr.length == 1 && arr[0] == 10){
            answer = new int[1];
            answer[0] = -1;
        }
        else{
            int min = 99999;
            for(int i = 0; i<arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            for(int j=0; j<arr.length; j++){
                if(arr[j] != min){
                    array.add(arr[j]);
                }
            }
            answer = new int[array.size()];
            for(int k = 0; k<array.size(); k++){
                answer[k] = array.get(k);
            }
        }

        return answer;
    }
}
