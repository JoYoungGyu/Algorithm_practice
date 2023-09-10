import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0; i<score.length; i++){
            if(arr1.size() < k){
                arr1.add(score[i]);
                Collections.sort(arr1);
                answer[i] = arr1.get(0);
            }else{
                arr1.add(score[i]);
                Collections.sort(arr1);
                arr1.remove(0);
                answer[i] = arr1.get(0);
            }
        }
        return answer;
    }
}
