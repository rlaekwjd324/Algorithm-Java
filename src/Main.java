import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            while (stringTokenizer.hasMoreTokens()) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(stringTokenizer.nextToken());
                stringBuilder.reverse();
                answer.append(stringBuilder).append(" ");
            }
            answer.append("\n");
        }
        System.out.print(answer);
    }
}
