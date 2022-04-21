import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(bufferedReader.readLine());
            int max = 0;
            String bestUnv = "";
            for (int j = 0; j < N; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                String university = stringTokenizer.nextToken();
                int bottle = Integer.parseInt(stringTokenizer.nextToken());
                if (max < bottle) {
                    max = bottle;
                    bestUnv = university;
                }
            }
            stringBuilder.append(bestUnv).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
