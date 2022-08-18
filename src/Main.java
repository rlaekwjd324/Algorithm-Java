import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N + 2; i++) {
            if (i == 0 || i == N + 1) {
                stringBuilder.append("@".repeat(N + 2));
            } else {
                stringBuilder.append("@");
                stringBuilder.append(" ".repeat(N));
                stringBuilder.append("@");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
