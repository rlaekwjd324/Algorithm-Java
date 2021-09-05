import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int idx = 1;
        int sum = 0;
        int value = 0;
        while (true) {
            if (idx > b) {
                System.out.print(sum);
                return;
            }
            value++;
            for (int i = 0; i < value; i++) {
                if (idx > b) {
                    break;
                }
                if (idx >= a) {
                    sum += value;
                }
                idx++;
            }
        }
    }
}
