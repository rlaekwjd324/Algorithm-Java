import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j <= N; j++) {
                if (j == N || N - j <= Math.abs(i - N + 1)) {
                    stringBuilder.append("\n");
                    break;
                }
                stringBuilder.append("*");
            }
        }
        System.out.print(stringBuilder);
    }
}
