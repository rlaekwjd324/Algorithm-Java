import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(bufferedReader.readLine());
            int max = 0;
            String expensive = "";
            for (int j = 0; j < p; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                int num = Integer.parseInt(stringTokenizer.nextToken());
                String player = stringTokenizer.nextToken();
                if (num > max) {
                    expensive = player;
                    max = num;
                }
            }
            stringBuilder.append(expensive).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
