public class Solution {
    static private int chanceCount, maxScore;
    static private int[] apeachScoreCounts, answerScoreCounts, ryanScoreCounts;

    public static int[] solution(int n, int[] info) {
        apeachScoreCounts = new int[11];
        answerScoreCounts = new int[11];
        ryanScoreCounts = new int[11];
        chanceCount = n;
        System.arraycopy(info, 0, apeachScoreCounts, 0, 11);
        maxScore = 0;
        dfs(0, 0);
        if (maxScore == 0) {
            return new int[]{-1};
        }
        return answerScoreCounts;
    }

    private static void dfs(int idx, int count) {
        if (count == chanceCount) {
            int score = getRyanScore();
            if (score == 0) {
                return;
            }
            if (maxScore < score) {
                maxScore = score;
                System.arraycopy(ryanScoreCounts, 0, answerScoreCounts, 0, 11);
            } else if (maxScore == score) {
                for (int i = 10; i >= 0; i--) {
                    if (ryanScoreCounts[i] > answerScoreCounts[i]) {
                        System.arraycopy(ryanScoreCounts, 0, answerScoreCounts, 0, 11);
                        return;
                    }
                }
            }
            return;
        }

        for (int i = idx; i < 11; i++) {
            ryanScoreCounts[i]++;
            dfs(i, count + 1);
            ryanScoreCounts[i]--;
        }
    }

    private static int getRyanScore() {
        int apeachScore = 0;
        int ryanScore = 0;
        for (int i = 0; i < 11; i++) {
            if (apeachScoreCounts[i] == 0 && ryanScoreCounts[i] == 0) {
                continue;
            }
            if (apeachScoreCounts[i] >= ryanScoreCounts[i]) {
                apeachScore += (10 - i);
            } else {
                ryanScore += (10 - i);
            }
        }
        if (apeachScore < ryanScore) {
            return ryanScore;
        }
        return 0;
    }
}