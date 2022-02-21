import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            int y = 0, k = 0;
            for (int j = 0; j < 9; j++) {
                StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                y += Integer.parseInt(stringTokenizer.nextToken());
                k += Integer.parseInt(stringTokenizer.nextToken());
            }
            if (y > k) {
                System.out.println("Yonsei");
                continue;
            }
            if (y < k) {
                System.out.println("Korea");
                continue;
            }
            System.out.println("Draw");
        }
    }
}
