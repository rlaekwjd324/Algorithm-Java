import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String str = bufferedReader.readLine();
            stringBuilder.append(str.charAt(0)).append(str.charAt(str.length() - 1)).append("\n");
        }
        System.out.print(stringBuilder);
    }
}
