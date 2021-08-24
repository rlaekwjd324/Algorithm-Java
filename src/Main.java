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
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            int num = Math.min(a, b);
            int gcd = 0;
            for (int j = 1; j <= num; j++) {
                if (a % j == 0 && b % j == 0) gcd = j;
            }
            int num2 = a * b / gcd;
            stringBuilder.append(num2).append(" ").append(gcd).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
