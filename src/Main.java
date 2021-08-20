import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int E = Integer.parseInt(stringTokenizer.nextToken());
        int S = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int e = 1, s = 1, m = 1, count = 1;
        while (true) {
            if (e == E && s == S && m == M) {
                System.out.print(count);
                return;
            }
            count++;
            if (e < 15) {
                e++;
            } else {
                e = 1;
            }
            if (s < 28) {
                s++;
            } else {
                s = 1;
            }
            if (m < 19) {
                m++;
            } else {
                m = 1;
            }
        }

    }
}
