import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());
            int[][] array = new int[m][n];
            for (int j = 0; j < m; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int k = 0; k < n; k++) {
                    array[j][k] = Integer.parseInt(stringTokenizer.nextToken());
                }
            }
            int sum = 0;
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if (array[j][k] == 1) {
                        for (int l = j + 1; l < m; l++) {
                            if (array[l][k] == 0) {
                                sum++;
                            }
                        }
                    }
                }
            }
            stringBuilder.append(sum).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
