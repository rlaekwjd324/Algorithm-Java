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
        int c = Integer.parseInt(stringTokenizer.nextToken());
        if (a == b && b == c) {
            System.out.println(10000 + a * 1000);
            return;
        }
        if (a == b || a == c) {
            System.out.println(1000 + 100 * a);
            return;
        }
        if (b == c) {
            System.out.println(1000 + 100 * b);
            return;
        }
        int max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println(max * 100);
    }
}
