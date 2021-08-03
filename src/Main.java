import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int array[] = new int[N + 1];
        int array2[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < M; i++) {
            int temp = Integer.parseInt(bufferedReader.readLine());
            for (int j = 1; j <= N; j++) {
                if (array[j] <= temp) {
                    array2[j]++;
                    break;
                }
            }
        }
        int max = 0;
        int maxNum = 0;
        for (int i = 1; i <= N; i++) {
            if (array2[i] > maxNum) {
                max = i;
                maxNum = array2[i];
            }
        }
        System.out.print(max);
    }
}
