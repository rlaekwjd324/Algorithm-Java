import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int sum = 0;
            for (int j = 0; j < String.valueOf((int) c).length(); j++) {
                sum += (String.valueOf((int) c).charAt(j) - '0');
            }
            for (int j = 0; j < sum; j++) {
                stringBuilder.append(c);
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
    }
}
