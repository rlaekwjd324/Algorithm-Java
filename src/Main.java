import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, max = -1000000000, min = 1000000000;
    static int[] array, cals;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        array = new int[N];
        cals = new int[4];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 4; i++) {
            cals[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        back(0, cals[0], cals[1], cals[2], cals[3], array[0]);
        System.out.println(max);
        System.out.print(min);
    }

    private static void back(int idx, int zero, int one, int two, int three, int result) {
        if (zero == 0 && one == 0 && two == 0 && three == 0) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }
        if (idx >= N) {
            return;
        }

        if (zero > 0) {
            back(idx + 1, zero - 1, one, two, three, result + array[idx + 1]);
        }
        if (one > 0) {
            back(idx + 1, zero, one - 1, two, three, result - array[idx + 1]);
        }
        if (two > 0) {
            back(idx + 1, zero, one, two - 1, three, result * array[idx + 1]);
        }
        if (three > 0) {
            back(idx + 1, zero, one, two, three - 1, result / array[idx + 1]);
        }
    }
}
