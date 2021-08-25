import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int M = Integer.parseInt(bufferedReader.readLine());
        int min = 1000000000, sum = 0;
        for (int i = N; i <= M; i++) {
            for (int j = (int) Math.sqrt(N); j <= Math.sqrt(M); j++) {
                if (j * j == i) {
                    min = Math.min(min, i);
                    sum += i;
                    break;
                }
            }
        }
        if (min == 1000000000) {
            System.out.print("-1");
            return;
        }
        System.out.println(sum);
        System.out.print(min);
    }
}
