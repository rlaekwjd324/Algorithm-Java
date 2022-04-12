import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int sum = 0;
            int min = 10;
            int max = 0;
            int[] array = new int[5];
            for (int j = 0; j < 5; j++) {
                int num = Integer.parseInt(stringTokenizer.nextToken());
                min = Math.min(min, num);
                max = Math.max(max, num);
                array[j] = num;
                sum += num;
            }
            Arrays.sort(array);
            if (Math.abs(array[1] - array[3]) >= 4) {
                stringBuilder.append("KIN");
            } else {
                stringBuilder.append(sum - min - max);
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
