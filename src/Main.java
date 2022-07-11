import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int sum = 0;
        for (int i = 2; i <= 10; i++) {
            int score = Integer.parseInt(stringTokenizer.nextToken());
            if (score > i / 2 * 100) {
                System.out.print("hacker");
                return;
            }
            sum += score;
        }
        System.out.print(sum >= 100 ? "draw" : "none");
    }
}
