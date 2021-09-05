import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] array = new int[N + 1];
        array[0] = 0;
        if (N == 0) {
            System.out.print(0);
            return;
        }
        array[1] = 1;
        for (int i = 2; i <= N; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.print(array[N]);
    }
}
