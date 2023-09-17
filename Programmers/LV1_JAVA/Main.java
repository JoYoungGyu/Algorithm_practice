class Solution {
    public boolean getSoSoo(int num){
        boolean check = true;
        for(int i = 2; i<num-1; i++){
            if(num%i==0){
                check = false;
                break;
            }
        }
        return check;
    }

    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<(nums.length)-2; i++){
            for(int j=i+1; j<(nums.length)-1;j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(getSoSoo(sum)){
                        answer++;
                    }
                }
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        //System.out.println("Hello Java");

        return answer;
    }
}