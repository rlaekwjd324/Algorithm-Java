import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = 100;
        for (int i = 0; i < 4; i++) {
            int score = Integer.parseInt(bufferedReader.readLine());
            min = Math.min(min, score);
            sum += score;
        }
        sum -= min;
        int historyScore = Integer.parseInt(bufferedReader.readLine());
        int geographyScore = Integer.parseInt(bufferedReader.readLine());
        int max = Math.max(historyScore, geographyScore);
        sum += max;
        System.out.print(sum);
    }
}
