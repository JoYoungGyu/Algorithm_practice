import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> poketmon = new HashSet<>();
        int answer = 0;
        int nums_len = nums.length/2;
        for(int i=0; i<nums.length; i++){
            if(!poketmon.contains(nums[i])){
                poketmon.add(nums[i]);
            }
        }

        if(poketmon.size() <= nums_len){
            answer = poketmon.size();
        }else{
            answer = nums_len;
        }

        return answer;
    }
}