import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int N, cnt = 0;
    static int[] queen;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bufferedReader.readLine());
        queen = new int[N];
        back(0);
        System.out.println(cnt);
    }

    private static void back(int count) {
        if (count == N) {
            cnt++;
            return;
        }
//        퀸은 열,행에 무조건 하나씩 들어가있어야함 그래서 행은 무조건 count로 잡고 열을 여러군데 넣어보는 것
        for (int j = 0; j < N; j++) {
            queen[count] = j;
            if (isSafe(count)) {
                back(count + 1);
            }
        }
    }

    private static boolean isSafe(int x) {
        for (int i = 0; i < x; i++) {
            if (queen[x] == queen[i]) {
                return false;
            }
            if (Math.abs(x - i) == Math.abs(queen[x] - queen[i])) {
                return false;
            }
        }
        return true;
    }
}
