import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N * 5; i++) {
            if (i >= N * 5 - N) {
                stringBuilder.append("@".repeat(Math.max(0, N * 5)));
            } else {
                stringBuilder.append("@".repeat(Math.max(0, N)));
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
