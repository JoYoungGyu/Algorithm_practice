import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        Queue<String> card1 = new LinkedList<>();
        Queue<String> card2 = new LinkedList<>();
        Queue<String> card3 = new LinkedList<>();


        for(int i=0; i<cards1.length; i++){
            card1.offer(cards1[i]);
        }

        for(int j=0; j<cards2.length; j++){
            card2.offer(cards2[j]);
        }

        for(int j2=0; j2<goal.length; j2++){
            card3.offer(goal[j2]);
        }

        for(int k=0; k<goal.length; k++){
            if(goal[k].equals(card1.peek())){
                card1.poll();
                card3.poll();
            }
            if(goal[k].equals(card2.peek())){
                card2.poll();
                card3.poll();
            }
        }

        if(card3.isEmpty()){
            answer="Yes";
        }else{
            answer="No";
        }

        return answer;
    }
}
