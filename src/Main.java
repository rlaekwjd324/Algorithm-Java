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
            if (str.charAt(0) < 97) {
                stringBuilder.append(str).append("\n");
            } else {
                stringBuilder.append((char) (str.charAt(0) - 32)).append(str.substring(1)).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
