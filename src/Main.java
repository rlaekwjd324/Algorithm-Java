import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, A, B, count;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        A = Integer.parseInt(stringTokenizer.nextToken());
        B = Integer.parseInt(stringTokenizer.nextToken());
        dfs(0);
        System.out.print(count);
    }

    private static void dfs(int cnt) {
        if (A == B) {
            count = cnt;
            return;
        }
        A = A / 2 + (A % 2);
        B = B / 2 + (B % 2);
        dfs(cnt + 1);
    }
}
