import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int min = 1000000000;
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int tempNumber = Integer.parseInt(bufferedReader.readLine());
            if (tempNumber % 2 == 1) {
                sum += tempNumber;
                min = Math.min(min, tempNumber);
            }
        }
        if (sum == 0) {
            System.out.print("-1");
            return;
        }
        System.out.print(sum + "\n" + min);
    }
}
