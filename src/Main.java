import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int correctCount = 0;
        int score = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken());
            if (a == 1) {
                correctCount++;
            } else {
                correctCount = 0;
            }
            score += correctCount;
        }
        System.out.println(score);
    }
}
