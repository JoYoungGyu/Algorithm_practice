class Solution {
    public int solution(int[] array) {
        int[] check_count = new int[1001];
        int max = -1;
        int answer = 0;
        for(int i=0; i<array.length; i++){
            check_count[array[i]]++;
        }
        for(int j=0; j<check_count.length; j++){
            if(max < check_count[j]){
                max = check_count[j];
                answer = j;
            }
        }

        for(int k=answer+1; k<check_count.length; k++){
            if(max == check_count[k]){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}