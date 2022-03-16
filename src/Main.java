import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int Q = Integer.parseInt(stringTokenizer.nextToken());
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = new int[N];
        for (int i = 0; i < N; i++) {
            nArray[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for (int i = 0; i < Q; i++) {
            int qNumber = Integer.parseInt(bufferedReader.readLine());
            int count = -1;
            for (int j = 0; j < N; j++) {
                count = count + nArray[j];
                if (count >= qNumber) {
                    stringBuilder.append(j + 1).append("\n");
                    break;
                }
            }
        }
        System.out.print(stringBuilder);
    }
}
