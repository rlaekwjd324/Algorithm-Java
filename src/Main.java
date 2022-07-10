import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        int R = Integer.parseInt(stringTokenizer.nextToken());
        int A = Integer.parseInt(stringTokenizer.nextToken());
        while (A > 0) {
            if (L > R) {
                R++;
            } else {
                L++;
            }
            A--;
        }
        System.out.print(Math.min(L, R) * 2);
    }
}
