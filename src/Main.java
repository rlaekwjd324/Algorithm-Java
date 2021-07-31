import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (j == N + i) {
                    stringBuilder.append("\n");
                    break;
                }
                if (i == 0 && j == N - 1) {
                    stringBuilder.append("*");
                    continue;
                }
                if ((i + j) % 2 != N % 2 && j >= (N - i - 1)) {
                    stringBuilder.append("*");
                    continue;
                }
                stringBuilder.append(" ");
            }
        }
        System.out.print(stringBuilder);
    }
}
