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
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < M; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int K = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < K; i++) {
            int sum = 0;
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int I = Integer.parseInt(stringTokenizer.nextToken());
            int J = Integer.parseInt(stringTokenizer.nextToken());
            int X = Integer.parseInt(stringTokenizer.nextToken());
            int Y = Integer.parseInt(stringTokenizer.nextToken());
            for (int j = I; j <= X; j++) {
                for (int k = J; k <= Y; k++) {
                    sum += array[j - 1][k - 1];
                }
            }
            stringBuilder.append(sum).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
