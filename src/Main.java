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
        int nSum = 0;
        for (int i = 0; i < N; i++) {
            nSum += Integer.parseInt(stringTokenizer.nextToken());
        }
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int mSum = 0;
        for (int i = 0; i < M; i++) {
            mSum += Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(Math.max(nSum - mSum, 0));
    }
}
