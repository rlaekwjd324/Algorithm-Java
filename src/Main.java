import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(Integer.parseInt(stringTokenizer.nextToken()), 2);
        }
        System.out.print(sum % 10);
    }
}
