import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
        if (m == 2) {
            if (d < 18) {
                System.out.println("Before");
                return;
            }
            if (d == 18) {
                System.out.println("Special");
                return;
            }
        }
        if (m < 2) {
            System.out.println("Before");
            return;
        }
        System.out.println("After");
    }
}
