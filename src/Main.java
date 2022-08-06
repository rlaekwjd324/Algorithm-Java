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
            if (str.length() >= 6 && str.length() <= 9) {
                stringBuilder.append("yes").append("\n");
            } else {
                stringBuilder.append("no").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
