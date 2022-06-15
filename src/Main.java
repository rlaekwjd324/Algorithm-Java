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
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1' || str.charAt(i) == 'o') {
                    count++;
                }
            }
            str = str.substring(0, str.length() - 1);
            if (count % 2 == 1) {
                str += "1";
            } else {
                str += "0";
            }
            stringBuilder.append(str).append("\n");
            str = bufferedReader.readLine();
        }
        System.out.print(stringBuilder);
    }
}
