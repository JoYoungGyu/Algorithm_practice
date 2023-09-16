class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] student1 = {1,2,3,4,5};
        int[] student2 = {2,1,2,3,2,4,2,5};
        int[] student3 = {3,3,1,1,2,2,4,4,5,5};
        int count1=0, count2=0, count3=0;
        for(int i=0; i<answers.length; i++){
            if(answers[i] == student1[i%student1.length]){
                count1++;
            }
            if(answers[i] == student2[i%student2.length]){
                count2++;
            }
            if(answers[i] == student3[i%student3.length]){
                count3++;
            }
        }
        if(count1 == count2 && count2== count3 && count1==count3){
            answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        }
        if(count1 == count2 && count1 > count3){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
        }
        if(count2 == count3 && count2 > count1){
            answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
        }
        if(count1 == count3 && count1 > count2){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
        }
        if(count1 > count2){
            if(count1 > count3){
                answer = new int[1];
                answer[0] = 1;
            }
        }
        if(count2 > count1){
            if(count2 > count3){
                answer = new int[1];
                answer[0] = 2;
            }
        }
        if(count3 > count2){
            if(count3 > count1){
                answer = new int[1];
                answer[0] = 3;
            }
        }


        return answer;

    }
}
