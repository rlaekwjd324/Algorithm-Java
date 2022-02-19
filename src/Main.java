import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int x = 0, y = 0, max = 0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for (int j = 0; j < 9; j++) {
                int a = Integer.parseInt(stringTokenizer.nextToken());
                if (max < a) {
                    max = a;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((x + 1) + " " + (y + 1));
    }
}
