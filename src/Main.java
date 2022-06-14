import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String str = bufferedReader.readLine();
            if (str.charAt(str.length() / 2) == str.charAt(str.length() / 2 - 1)) {
                stringBuilder.append("Do-it").append("\n");
            } else {
                stringBuilder.append("Do-it-Not").append("\n");
            }
        }
        System.out.print(stringBuilder);
    }
}
