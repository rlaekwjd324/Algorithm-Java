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
        for (int i = 1; i <= N; i++) {
            array[i] = i;
        }
        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(stringTokenizer.nextToken());
            int B = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = 0; j <= (B - A) / 2; j++) {
                int temp = array[A + j];
                array[A + j] = array[B - j];
                array[B - j] = temp;
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
