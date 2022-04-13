import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            stringBuilder.append("god");
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            stringTokenizer.nextToken();
            while (stringTokenizer.hasMoreTokens()) {
                stringBuilder.append(stringTokenizer.nextToken());
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
