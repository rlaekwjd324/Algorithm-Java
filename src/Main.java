import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int A = 0, B = 0, C = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            A += Integer.parseInt(stringTokenizer.nextToken());
            B += Integer.parseInt(stringTokenizer.nextToken());
            C += Integer.parseInt(stringTokenizer.nextToken());
            if (A >= 30 && B >= 30 && C >= 30) {
                int min = Math.min(A, B);
                min = Math.min(min, C);
                A -= min;
                B -= min;
                C -= min;
                stringBuilder.append(min).append("\n");
            } else {
                stringBuilder.append("NO").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
