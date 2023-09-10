class Solution {
    public String solution(int a, int b) {
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] day = {"SUN" , "MON" , "TUE", "WED","THU","FRI","SAT"};
        String answer = "";
        int count = 0;
        for(int i=0; i<a-1; i++){
            count += month[i];
        }
        count +=b;
        count +=5;
        count = count%7;
        if(count == 0){
            count = 6;
        }else{
            count--;
        }
        answer = day[count];
        return answer;
    }
}
