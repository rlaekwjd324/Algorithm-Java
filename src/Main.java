import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int number = Integer.parseInt(bufferedReader.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(stringTokenizer.nextToken());
            if (a == number) {
                count++;
            }
        }
        System.out.println(count);
    }
}
