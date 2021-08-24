import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        for (int i = 1; i <= a + b; i++) {
            if ((a + b) % i == 0) {
                int w = (a + b) / i;
                if (2 * i + 2 * w - 4 == a) {
                    System.out.print(Math.max(w, i) + " " + Math.min(w, i));
                    return;
                }
            }
        }
    }
}
