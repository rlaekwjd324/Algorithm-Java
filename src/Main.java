import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S, count;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        S = Integer.parseInt(stringTokenizer.nextToken());
        array = new int[N];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        sumPartArray(0, new boolean[N], 0);
        System.out.print(count);
    }

    private static void sumPartArray(int idx, boolean[] check, int cnt) {
        if (idx == N && cnt > 0) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if (check[i]) {
                    sum += array[i];
                }
            }
            if (sum == S) {
                count++;
            }
            return;
        }
        if (idx >= N) {
            return;
        }
        check[idx] = true;
        sumPartArray(idx + 1, check, cnt + 1);
        check[idx] = false;
        sumPartArray(idx + 1, check, cnt);
    }
}
