import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2 * N - 1; i++) {
            for (int j = 0; j < 2 * N - 1; j++) {
                if (i < N - 1) {
//                  i가 N-1보다 작을 때 (윗 줄)
                    if (2 * N - j - i == 1) {
                        break;
                    }
                    if (j >= i) {
                        stringBuilder.append("*");
                        continue;
                    }
                    stringBuilder.append(" ");
                } else {
//                  i가 N보다 클 때 (아랫 줄)
                    if (j - i == 1) {
                        break;
                    }
                    if (2 * N - 1 - i > j + 1) {
                        stringBuilder.append(" ");
                        continue;
                    }
                    stringBuilder.append("*");
                }
            }
            if (i != 2 * N - 2) {
                stringBuilder.append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
