import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            Arrays.sort(array);
            stringBuilder.append(array[0]).append(" ").append(array[n - 1]).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
