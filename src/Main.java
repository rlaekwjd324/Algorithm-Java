import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                int tk = 0;
                for (int k = 1; k <= j + 1; k++) {
                    tk += k;
                }
                sum += (tk * j);
            }
            stringBuilder.append(sum).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
