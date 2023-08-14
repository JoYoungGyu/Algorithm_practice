class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        String[] sum_arr = Integer.toString(x).split("");

        for(int i =0; i<sum_arr.length; i++){
            sum += Integer.parseInt(sum_arr[i]);
        }

        if(x%sum == 0) answer = true;
        else answer = false;
        return answer;
    }
}
