import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String N = bufferedReader.readLine();
        int count = 0;
        while (true) {
            if (N.length() <= 1) {
                System.out.print(count);
                return;
            }
            int temp = 1;
            for (int i = 0; i < N.length(); i++) {
                temp = temp * (N.charAt(i) - '0');
            }
            N = String.valueOf(temp);
            count++;
        }
    }
}
