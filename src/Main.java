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
            for (int j = 0; j < num; j++) {
                stringBuilder.append("=");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
