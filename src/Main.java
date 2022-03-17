import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        String L = stringTokenizer.nextToken();
        int count = 0;
        for (int i = 0; i < N; i++) {
            while (true) {
                count++;
                if (!String.valueOf(count).contains(L)) {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
