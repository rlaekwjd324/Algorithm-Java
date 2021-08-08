import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int winner = 0;
        int winnerScore = 0;
        for (int i = 0; i < 5; i++) {
            int sumScore = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 4; j++) {
                sumScore += Integer.parseInt(stringTokenizer.nextToken());
            }
            if (winnerScore < sumScore) {
                winnerScore = sumScore;
                winner = i + 1;
            }
        }
        System.out.print(winner + " " + winnerScore);
    }
}
