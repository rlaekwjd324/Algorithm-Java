import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        for (int i = 1; i < N; i++) {
            if (isCons(i)) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }

    private static boolean isCons(int num) {
        int sum = num;
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            sum += (String.valueOf(num).charAt(i) - '0');
        }
        return sum == N;
    }
}
