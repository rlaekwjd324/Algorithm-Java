import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < 2 * N; j++) {
                if (i <= N - 1) {
                    if (j <= i || j >= 2 * N - 1 - i) {
                        stringBuilder.append("*");
                        continue;
                    }
                }
                if (i > N - 1) {
                    if (j > i || j < 2 * N - 1 - i) {
                        stringBuilder.append("*");
                        continue;
                    }
                }
                stringBuilder.append(" ");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
