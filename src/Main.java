import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(bufferedReader.readLine());
        int now = 1;
        for (int i = 0; i < M; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int X = Integer.parseInt(stringTokenizer.nextToken());
            int Y = Integer.parseInt(stringTokenizer.nextToken());
            if (X == now) {
                now = Y;
            } else if (Y == now) {
                now = X;
            }
        }
        System.out.println(now);
    }
}
