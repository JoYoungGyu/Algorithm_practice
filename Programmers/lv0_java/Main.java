import java.util.*;

class Solution {
    public int[] solution(int num, int total) {
        List<Integer> array = new ArrayList<>();
        int mid = total/num;
        if(total%num == 0){
            int index = (num-1)/2;
            mid -= index;
            for(int i=0; i<num; i++){
                array.add(mid);
                mid++;
            }
        }else{
            int index = (num-2)/2;
            mid -= index;
            for(int i=0; i<num; i++){
                array.add(mid);
                mid++;
            }
        }
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        return answer;
    }
}