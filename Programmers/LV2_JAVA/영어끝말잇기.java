import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        List<String> usedWords = new ArrayList<>();
        usedWords.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            // 이전에 나온 단어인지 확인
            if (usedWords.contains(words[i]) || (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0))) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            usedWords.add(words[i]);
        }

        return answer;
    }
}
