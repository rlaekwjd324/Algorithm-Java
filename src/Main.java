import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int[] array = new int[m];
        int sum = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < m; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % array[j] == 0) {
                    sum += i;
                    break;
                }
            }
        }
        System.out.print(sum);
    }
}
