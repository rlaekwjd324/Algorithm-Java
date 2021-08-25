import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int K = Integer.parseInt(stringTokenizer.nextToken());
        int[][] array = new int[6][2];
        for (int i = 0; i < N; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int gender = Integer.parseInt(stringTokenizer.nextToken());
            int grade = Integer.parseInt(stringTokenizer.nextToken());
            array[grade - 1][gender]++;
        }
        int sum = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                if (array[i][j] % K == 0) {
                    sum += (array[i][j] / K);
                } else {
                    sum += (array[i][j] / K + 1);
                }
            }
        }
        System.out.print(sum);
    }
}
