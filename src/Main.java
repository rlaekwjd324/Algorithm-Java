import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        while (!str.equals("0")) {
            stringBuilder.append(str).append(" ");
            while (str.length() > 1) {
                int div = 1;
                for (int i = 0; i < str.length(); i++) {
                    div = div * (str.charAt(i) - '0');
                }
                str = String.valueOf(div);
                stringBuilder.append(str).append(" ");
            }
            stringBuilder.append("\n");
            str = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
