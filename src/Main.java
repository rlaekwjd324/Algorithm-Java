import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, max;
    static boolean[] check;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N];
        check = new boolean[N];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        dfs(array, 0);
        System.out.print(max);
    }

    private static void getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            sum += Math.abs(array[i] - array[i + 1]);
        }
        max = Math.max(max, sum);
    }

    private static void dfs(int[] array, int n) {
        if (n == N) {
            getSum(array);
            return;
        }
        for (int i = n; i < N; i++) {
            swap(array, i, n);
            dfs(array, n + 1);
            swap(array, i, n);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
