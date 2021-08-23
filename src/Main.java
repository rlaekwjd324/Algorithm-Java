import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static boolean[] check;
    static int[] output;
    static StringBuilder stringBuilder;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        stringBuilder = new StringBuilder();
        output = new int[N];
        check = new boolean[N];
        getArray(0);
        System.out.print(stringBuilder);
    }

    private static void getArray(int idx) {
        if (idx == N) {
            for (int i = 0; i < N; i++) {
                stringBuilder.append(output[i]).append(" ");
            }
            stringBuilder.append("\n");
        }
        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                check[i] = true;
                output[idx] = i + 1;
                getArray(idx + 1);
                check[i] = false;
            }
        }
    }
}
