import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append("Pairs for ").append(num).append(":");
            for (int j = 1; j <= num / 2; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (j + k == num) {
                        stringBuilder.append(" ").append(j).append(" ").append(k).append(",");
                    }
                }
            }
            if (stringBuilder.charAt(stringBuilder.length() - 1) != ':') {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
