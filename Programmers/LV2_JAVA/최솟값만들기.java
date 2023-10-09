import java.util.Arrays;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int[] copy_A = new int[A.length];
        Integer[] copy_B = new Integer[B.length];

        for(int i=0; i<A.length; i++){
            copy_A[i] = A[i];
            copy_B[i] = B[i];
        }
        Arrays.sort(copy_A);
        Arrays.sort(copy_B, Collections.reverseOrder());

        for(int i=0; i<A.length; i++){
            answer += copy_A[i]*copy_B[i];
        }

        return answer;
    }
}
