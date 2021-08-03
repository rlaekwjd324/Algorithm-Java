import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 0; i < K; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int time = 0;
            int tempReadingTime = 0;
            int S = Integer.parseInt(stringTokenizer.nextToken());
            int T = Integer.parseInt(stringTokenizer.nextToken());
            int R = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;
            while (true) {
                count += S;
                time++;
                tempReadingTime++;
                if (count >= N) {
                    break;
                }
                if (tempReadingTime == T) {
                    time += R;
                    tempReadingTime = 0;
                }
            }
            stringBuilder.append(time).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
