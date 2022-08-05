import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = bufferedReader.readLine().replaceAll(" ", "");
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += ((int) str.charAt(j) - 64);
            }
            if (sum == 100) {
                stringBuilder.append("PERFECT LIFE").append("\n");
            } else {
                stringBuilder.append(sum).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
