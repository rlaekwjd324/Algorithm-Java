import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N * 5; i++) {
            if (i < N || i >= N * 5 - N) {
                for (int j = 0; j < N * 5; j++) {
                    stringBuilder.append("@");
                }
            } else {
                for (int j = 0; j < N; j++) {
                    stringBuilder.append("@");
                }
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
