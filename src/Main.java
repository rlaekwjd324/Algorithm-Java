import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int max = -1000000;
        int min = 1000000;
        for (int i = 0; i < N; i++) {
            int tempNumber = Integer.parseInt(stringTokenizer.nextToken());
            max = Math.max(max, tempNumber);
            min = Math.min(min, tempNumber);
        }
        System.out.print(min+" "+max);
    }
}
