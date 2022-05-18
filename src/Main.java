import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                sum += (String.valueOf(i).charAt(j) - '0');
            }
            if (i % sum == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
