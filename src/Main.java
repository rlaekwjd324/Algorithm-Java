import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N, M;
    static StringBuilder stringBuilder;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());
        stringBuilder = new StringBuilder();
        array = new int[M];
        back(1, 0);
        System.out.print(stringBuilder);
    }

    private static void back(int idx, int count) {
        if (count == M) {
            for (int a : array) {
                stringBuilder.append(a).append(" ");
            }
            stringBuilder.append("\n");
            return;
        }
        for (int i = idx; i <= N; i++) {
            array[count] = i;
            back(i, count + 1);
        }
    }
}
