import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int d = Integer.parseInt(bufferedReader.readLine());
            boolean isExist = false;
            for (int j = d / 2; j > 0; j--) {
                if (j * (j + 1) <= d) {
                    stringBuilder.append(j).append("\n");
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                stringBuilder.append("0").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
