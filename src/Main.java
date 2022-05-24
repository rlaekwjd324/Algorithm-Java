import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int p = Integer.parseInt(stringTokenizer.nextToken());
            int m = Integer.parseInt(stringTokenizer.nextToken());
            int count = 0;
            boolean[] array = new boolean[m];
            for (int j = 0; j < p; j++) {
                int position = Integer.parseInt(bufferedReader.readLine());
                if (array[position - 1]) {
                    count++;
                } else {
                    array[position - 1] = true;
                }
            }
            stringBuilder.append(count).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
