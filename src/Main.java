import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] num = new int[5];
        int min = 1000000000;
        for (int i = 0; i < 5; i++) {
            num[i] = Integer.parseInt(stringTokenizer.nextToken());
            min = Math.min(min, num[i]);
        }
        while (true) {
            int cnt = 0;
            for (int i = 0; i < 5; i++) {
                if (min % num[i] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                System.out.print(min);
                return;
            }
            min++;
        }
    }
}
