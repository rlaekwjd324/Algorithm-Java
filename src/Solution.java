import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int correctCount = 0;
        List numbers = Arrays.stream(lottos).boxed().collect(Collectors.toList());
        for (int num : win_nums) {
            if (numbers.contains(num)) {
                correctCount++;
            }
        }
        return new int[]{getLottoRanking(correctCount+Collections.frequency(numbers, 0)), getLottoRanking(correctCount)};
    }

    private int getLottoRanking(int correctNum) {
        if (correctNum == 0) {
            correctNum = 1;
        }
        return 7 - correctNum;
    }
}