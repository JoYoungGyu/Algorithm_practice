import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int a = commands[i][0];
            int b = commands[i][1];
            int c = commands[i][2];
            int[] arr1 = Arrays.copyOfRange(array, a-1, b);
            Arrays.sort(arr1);
            answer[i] = arr1[c-1];
        }
        return answer;
    }
}