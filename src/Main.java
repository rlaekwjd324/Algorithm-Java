import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] array;
    static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        array = new int[9];
        for (int i = 0; i < 9; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        stringBuilder = new StringBuilder();
        dfs(0, new boolean[9], 0, 0);
        System.out.print(stringBuilder);
    }

    private static void dfs(int idx, boolean[] check, int count, int sum) {
        if (count == 7) {
            if (sum == 100) {
                for (int i = 0; i < 9; i++) {
                    if (check[i]) {
                        stringBuilder.append(array[i]).append("\n");
                    }
                }
            }
        }
        if (idx >= 9) {
            return;
        }
        check[idx] = true;
        dfs(idx + 1, check, count + 1, sum + array[idx]);
        check[idx] = false;
        dfs(idx + 1, check, count, sum);
    }
}
