import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int N = Integer.parseInt(stringTokenizer.nextToken());
            int M = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;
            for (int j = N; j <= M; j++) {
                String num = String.valueOf(j);
                for (int k = 0; k < num.length(); k++) {
                    if (num.charAt(k) == '0') {
                        count++;
                    }
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
