import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        while (C != 1) {
            if (C % 2 == 0) {
                C = C / 2;
            } else {
                C = C * 3 + 1;
            }
            count++;
        }
        System.out.print(count);
    }
}
