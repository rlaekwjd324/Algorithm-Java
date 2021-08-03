import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        int D = Integer.parseInt(stringTokenizer.nextToken());
        int time = 0;
        while (true) {
            time++;
            if (time > N * (L + 5) - 5) {
                if (time % D == 0) {
                    System.out.print(time);
                    return;
                }
            }
            if (time % (L + 5) >= L) {
                if (time % D == 0) {
                    System.out.print(time);
                    return;
                }
            }
        }
    }
}
