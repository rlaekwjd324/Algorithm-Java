import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        long sum = 0;
        while (n != -1) {
            sum += n;
            n = Integer.parseInt(bufferedReader.readLine());
        }
        System.out.print(sum);
    }
}
