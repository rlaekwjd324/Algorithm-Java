import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int mok = Integer.parseInt(bufferedReader.readLine());
            int nmg = 0;
            int cnt = 0;
            while (mok > 0) {
                nmg = mok % 2;
                mok = mok / 2;
                if (nmg == 1) {
                    stringBuilder.append(cnt).append(" ");
                }
                cnt++;
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
