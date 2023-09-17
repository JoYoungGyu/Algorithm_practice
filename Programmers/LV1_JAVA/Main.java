class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int[] paint = new int[n];
        for(int i=0; i<section.length; i++){
            paint[section[i]-1] = 1;
        }
        int count = 0;

        while(count < paint.length){
            if(paint[count] == 1){
                count += m;
                answer++;
            }else{
                count++;
            }
        }
        return answer;
    }
}