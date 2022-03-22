import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = bufferedReader.readLine();
            int num = 0;
            for (int j = 0; j < 3; j++) {
                int frontNum = str.split("-")[0].charAt(j) - 65;
                num += Math.pow(26, 3 - j - 1) * frontNum;
            }
            int s = Integer.parseInt(str.split("-")[1]);
            if (Math.abs(num - s) <= 100) {
                stringBuilder.append("nice").append("\n");
            } else {
                stringBuilder.append("not nice").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
