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
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int maxH = 0;
        for (int i = 0; i < N; i++) {
            maxH = Math.max(maxH, Integer.parseInt(stringTokenizer.nextToken()));
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int maxA = 0;
        for (int i = 0; i < M; i++) {
            maxA = Math.max(maxA, Integer.parseInt(stringTokenizer.nextToken()));
        }
        System.out.print(maxH + maxA);
    }
}
