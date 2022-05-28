import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!str.equals("#")) {
            int count = 0;
            char c = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == c || str.charAt(i) == (c - 32)) {
                    count++;
                }
            }
            stringBuilder.append(c).append(" ").append(count).append("\n");
            str = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
