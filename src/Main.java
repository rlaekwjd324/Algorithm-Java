import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] array = new int[3];
        array[0] = Integer.parseInt(stringTokenizer.nextToken());
        array[1] = Integer.parseInt(stringTokenizer.nextToken());
        array[2] = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(bufferedReader.readLine());
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                stringTokenizer = new StringTokenizer(bufferedReader.readLine());
                for (int w = 0; w < 3; w++) {
                    sum += Integer.parseInt(stringTokenizer.nextToken()) * array[w];
                }
            }
            if (max < sum) {
                max = sum;
            }
        }
        System.out.print(max);
    }
}
