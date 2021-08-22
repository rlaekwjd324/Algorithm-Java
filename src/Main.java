import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M, max;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        dfs(0, 0, 0);
        System.out.print(max);
    }

    private static void dfs(int idx, int count, int sum) {
        if (sum > M) {
            return;
        }
        if (count == 3) {
            max = Math.max(max, sum);
            return;
        }
        if (idx >= N) {
            return;
        }
        dfs(idx + 1, count + 1, sum + array[idx]);
        dfs(idx + 1, count, sum);
    }
}
