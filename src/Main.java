import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] counts = new int[N];
        int count = 1;
        for (int i = 0; i < N; i++) {
            counts[i] = Integer.parseInt(bufferedReader.readLine());
        }
        Arrays.sort(counts);
        for (int i = 0; i < N; i++) {
            count = count - 1 + counts[N - i - 1];
        }
        System.out.print(count);
    }
}
