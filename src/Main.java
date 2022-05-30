import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(bufferedReader.readLine());
        String str = bufferedReader.readLine();
        int sum = 0;
        for (int i = 0; i < L; i++) {
            sum += (str.charAt(i) - 64);
        }
        System.out.print(sum);
    }
}
