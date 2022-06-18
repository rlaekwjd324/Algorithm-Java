import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (i % 5) + 1;
        }
        for (int i = 0; i < N; i++) {
            int count = 0;
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < array.length; j++) {
                if (array[j] == Integer.parseInt(stringTokenizer.nextToken())) {
                    count++;
                }
            }
            if (count == 10) {
                stringBuilder.append(i + 1).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
