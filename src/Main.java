import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int sum = 0;
            int min = 100;
            for (int j = 0; j < 7; j++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if (num % 2 == 0) {
                    sum += num;
                    min = Math.min(min, num);
                }
            }
            stringBuilder.append(sum).append(" ").append(min).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
