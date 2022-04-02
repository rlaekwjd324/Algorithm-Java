import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < K; i++) {
            int h = Integer.parseInt(bufferedReader.readLine());
            String actions = bufferedReader.readLine();
            for (int j = 0; j < actions.length(); j++) {
                if (h == 0) {
                    break;
                }
                if (actions.charAt(j) == 'c') {
                    h++;
                } else {
                    h--;
                }
            }
            stringBuilder.append("Data Set ").append(i + 1).append(":").append("\n").append(h).append("\n\n");
        }
        System.out.print(stringBuilder);
    }
}
