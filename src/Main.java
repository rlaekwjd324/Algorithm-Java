import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] array = new int[10];
    static int[] check = new int[10];
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        back(0);
        System.out.println(count);
    }

    private static void back(int cnt) {
        if (cnt == 10) {
            int ansCount = 0;
            for (int i = 0; i < 10; i++) {
                if (array[i] == check[i]) {
                    ansCount++;
                }
            }
            if (ansCount >= 5) {
                count++;
            }
            return;
        }
        for (int i = 1; i <= 5; i++) {
            if (cnt > 1) {
                if (check[cnt - 1] == check[cnt - 2] && check[cnt - 1] == i) {
                    continue;
                }
            }
            check[cnt] = i;
            back(cnt + 1);
        }
    }
}
