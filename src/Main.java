import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(bufferedReader.readLine());
            int count = 0;
            boolean array[] = new boolean[a];
            for (int j = 2; j <= a; j++) {
                for (int k = 1; k <= a / j; k++) {
                    array[j * k - 1] = !array[j * k - 1];
                }
            }
            for (int j = 0; j < a; j++) {
                if (!array[j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
