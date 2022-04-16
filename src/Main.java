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
            String str = bufferedReader.readLine();
            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == '1') {
                    array[i][M - j - 1] = 1;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                stringBuilder.append(array[i][j]);
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
