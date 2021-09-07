import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static int N, K;
    static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        K = Integer.parseInt(stringTokenizer.nextToken());
        back("", 0);
        Collections.sort(arrayList);
        if (arrayList.size() <= K - 1) {
            System.out.print("-1");
            return;
        }
        System.out.print(arrayList.get(K - 1));
    }

    private static void back(String value, int sum) {
        if (sum == N) {
            arrayList.add(value);
            return;
        }
        if (sum > N) {
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (sum == 0) {
                back(String.valueOf(i), i);
            } else {
                back(value + "+" + i, sum + i);
            }
        }
    }
}
