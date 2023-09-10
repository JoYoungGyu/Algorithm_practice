import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Iterator;

class Solution {
    public int[] solution(int[] numbers) {
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<Integer>();
        Arrays.sort(numbers);
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++)
                linkedhashset.add(numbers[i] +numbers[j]);
        }
        int[] answer = new int[linkedhashset.size()];
        int count = 0;

        for(int num : linkedhashset){
            answer[count++] = num;
        }
        Arrays.sort(answer);
        return answer;

    }
}