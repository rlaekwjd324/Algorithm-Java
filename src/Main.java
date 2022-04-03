import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        if (N % 2 == 0) {
            System.out.print(((N + 2) / 2) * ((N + 2) / 2));
            return;
        }
        System.out.print(((N + 2) / 2) * ((N + 2) / 2 + 1));
    }
}
